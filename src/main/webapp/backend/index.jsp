<%--
  Created by IntelliJ IDEA.
  User: 86183
  Date: 2022/11/25
  Time: 23:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style  scoped>
        *{
            margin: 0;
            padding: 0;
        }
        body{
            height: 100%;
            width: 100%;
        }
        #app{
            position: fixed;
            height: 100%;
            width: 100%;
        }
        .allHeight{
            height: 100%;
        }
        .el-header {
            background-color: #7169A2;
            color: #F2F6FC;
            line-height: 60px;
        }
        .title{
            font-size: 20px;
            font-weight: bold;
            display: inline-block;
        }
        .oper{
            text-align: right;
            margin: 0 30px;
            float: right;
        }
        a{
            text-decoration: none;
            color: #FF4A60;
        }


        .el-aside {
            background-color: #CCCFF0;
            height: 100%;
            color: #333;
            text-align: center;
            line-height: 200px;
        }

        .el-main {
            background-color: #FFFFFF;
            color: #333;
            overflow-y: scroll;
        }
        .el-table{
            margin-top: 30px;
        }

        body > .el-container {
            margin-bottom: 40px;
            height: 100%;
        }
    </style>
</head>
<body>
<div id="app">
    <el-container class="allHeight">
        <el-header>
            <div class="title">友谊书城管理后台</div>
            <div class="oper">
                欢迎您：${user.username}   &nbsp;&nbsp;&nbsp;  <a href="/bookMall/logoutServlet">退出登录</a>
            </div>
        </el-header>
        <el-container>
            <el-aside width="200px" class="allHeight">
                <el-menu default-active="2" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose"
                         background-color="#CCCFF0" text-color="#333" active-text-color="#FF4A60" default-active="1">
                    <el-menu-item index="1">
                        <i class="el-icon-menu"></i>
                        <span slot="title">首页</span>
                    </el-menu-item>
                    <el-menu-item
                            v-for="item in menuList"
                            :index="item.id"
                            @click="selectMenu(item)">
                        <i :class="item.icon"></i>
                        <span slot="title">{{item.name}}</span>
                    </el-menu-item>
                </el-menu>
            </el-aside>



            <el-main style="height: 877px; overflow-y: scroll">
                <!--搜索表单-->
                <el-form :inline="true" class="demo-form-inline">

                    <el-form-item label="书名">
                        <el-input placeholder="书名" v-model="book.title" ></el-input>
                    </el-form-item>

                    <el-form-item label="作者">
                        <el-input placeholder="作者" v-model="book.author" ></el-input>
                    </el-form-item>

                    <el-form-item>
                        <el-button type="primary" @click="onSubmit">查询</el-button>
                    </el-form-item>
                </el-form>
                <!--按钮-->
                <el-row>
                    <el-button type="danger"   plain @click="deleteByIds">批量删除</el-button>
                    <el-button type="primary" plain @click="dialogVisible = true">新增</el-button>
                </el-row>
                <!--添加数据对话框表单-->
                <el-dialog
                        title="编辑商品"
                        :modal-append-to-body="false"
                        :visible.sync="dialogVisible"
                        width="30%">
                    <el-form ref="form" :model="book" label-width="80px">
                        <el-form-item label="书名">
                            <el-input v-model="book.title"></el-input>
                        </el-form-item>

                        <el-form-item label="作者">
                            <el-input v-model="book.author"></el-input>
                        </el-form-item>

                        <el-form-item label="简介">
                            <el-input type="textarea" v-model="book.intro"></el-input>
                        </el-form-item>

                        <el-form-item label="价格">
                            <el-input v-model="book.price"></el-input>
                        </el-form-item>
                        <el-form-item label="销量">
                            <el-input v-model="book.sold"></el-input>
                        </el-form-item>
                        <el-form-item label="库存">
                            <el-input v-model="book.inventory"></el-input>
                        </el-form-item>

                        <el-form-item>
                            <template slot-scope="scope">
                                <el-button type="primary" @click="addBook(book.id)">提交</el-button>
                                <el-button @click="dialogVisible = false">取消</el-button>
                            </template>
                        </el-form-item>
                    </el-form>

                </el-dialog>


                <!--表格-->
                <template>
                    <el-table
                            :data="tableData"
                            style="width: 100%;margin-bottom: 20px;overflow: auto"
                            :row-class-name="tableRowClassName"
                            @selection-change="handleSelectionChange"
                    >
                        <!--						复选框-->
                        <el-table-column
                                type="selection"
                                width="55">
                        </el-table-column>
                        <!--						序号-->
                        <el-table-column
                                type="index"
                                width="50">
                        </el-table-column>

                        <el-table-column
                                prop="title"
                                label="书名"
                                align="center"
                        >
                        </el-table-column>
                        <el-table-column
                                prop="author"
                                label="作者"
                                align="center"
                        >
                        </el-table-column>
                        <el-table-column
                                prop="intro"
                                show-overflow-tooltip
                                align="center"
                                label="简介">
                        </el-table-column>
                        <el-table-column
                                prop="price"
                                align="center"
                                label="价格">
                        </el-table-column>
                        <el-table-column
                                prop="sold"
                                align="center"
                                label="销量">
                        </el-table-column>
                        <el-table-column
                                prop="inventory"
                                align="center"
                                label="库存">
                        </el-table-column>

                        <el-table-column
                                align="center"
                                label="操作">
                            <template slot-scope="scope">
                                <el-button type="primary" @click.native.prevent="updateById(scope.row)">修改</el-button>
                                <el-button type="danger" @click.native.prevent="deleteById(scope.row)">删除</el-button>
                            </template>

                        </el-table-column>
                    </el-table>
                </template>

                <!--分页工具条-->
                <el-pagination
                        @size-change="handleSizeChange"
                        @current-change="handleCurrentChange"
                        :current-page="currentPage"
                        :page-sizes="[5, 10, 15, 20]"
                        :page-size="pageSize"
                        layout="total, sizes, prev, pager, next, jumper"
                        :total="totalCount">
                </el-pagination>

            </el-main>
        </el-container>
    </el-container>
</div>

<script src="js/axios-0.18.0.js"></script>
<script src="js/vue.js"></script>
<script src="../element-ui/lib/index.js"></script>
<link rel="stylesheet" href="../element-ui/lib/theme-chalk/index.css">

<script type="text/javascript">
    new Vue({
        el:"#app",
        data(){
            return{
                // 复选框选中数据集合
                multipleSelection: [],
                tableData:[],
                // 商品模型数据
                book: {
                    title: '',
                    author: '',
                    intro:'',
                    price: '',
                    sold:'',
                    inventory:''
                },
                // 添加数据对话框是否展示的标记
                dialogVisible: false,
                selectedIds:[],
                // 当前页码
                currentPage: 1,
                pageSize: 5,
                totalCount:0,
                menuList:[
                    {
                        id:'2',
                        name:'关于我们',
                        url:'/backend/about.html',
                        icon:'el-icon-setting'
                    },
                    {
                        id:'3',
                        name:'test',
                        url:'/backend/test.html',
                        icon:'el-icon-setting'
                    }
                ]
            }
        },
        mounted(){
            this.selectAll()
        },
        methods: {
            selectMenu(item){
              console.log(item)
            },
            handleOpen(key, keyPath) {
                console.log(key, keyPath);
            },
            handleClose(key, keyPath) {
                console.log(key, keyPath);
            },
            tableRowClassName({row, rowIndex}) {
                if (rowIndex === 1) {
                    return 'warning-row';
                } else if (rowIndex === 3) {
                    return 'success-row';
                }
                return '';
            },
            //分页
            handleSizeChange(val) {
                console.log(`每页 ${val} 条`);
                this.pageSize = val;
                this.selectAll()
            },
            handleCurrentChange(val) {
                console.log(`当前页: ${val}`);
                this.currentPage = val;
                this.selectAll()
            },
            // 复选框选中后执行的方法
            handleSelectionChange(val) {
                this.multipleSelection = val;
                console.log(this.multipleSelection)
            },
            // 查询方法
            onSubmit() {
                this.selectAll()
            },
            onsubmit(){
                this.selectAll()
            },
            //  查询所有数据
            selectAll(){
                // 当页面加载完成后，发送异步请求请求数据
                axios({
                    method:"post",
                    url:"http://localhost:8080/bookMall/book/selectByPageAndCondition?currentPage="+this.currentPage+"&pageSize="+this.pageSize,
                    data:this.book
                }).then((resp)=>{
                    this.tableData = resp.data.rows
                    this.totalCount = resp.data.totalCount
                })
            },
            // 添加数据
            addBook(id){
                const _this = this;
                if (id === undefined){
                    // 发送ajax请求，添加异步数据
                    axios({
                        method: "post",
                        url: "http://localhost:8080/bookMall/book/add",
                        data: _this.book
                    }).then(function (resp) {
                        if (resp.data === "success") {
                            _this.dialogVisible = false;
                            _this.selectAll()
                            _this.$message({
                                showClose: true,
                                message: '添加成功',
                                type: 'success'
                            });
                        }
                        _this.book = {}
                    })
                }else{
                    axios({
                        method:"post",
                        url:"http://localhost:8080/bookMall/book/update",
                        data:_this.book
                    }).then(function (resp){
                        if (resp.data === "success"){
                            _this.dialogVisible = false
                            _this.selectAll()
                            _this.$message({
                                showClose: true,
                                message:'修改成功',
                                type:'success'
                            });
                            _this.book = {}  // 清空数据，避免修改后点击添加还存在数据
                            _this.selectAll()
                        }
                    })
                }
            },
            // 点击修改
            updateById(row){
                var _this = this;
                axios({
                    method:"get",
                    url:"http://localhost:8080/bookMall/book/selectById?id="+row.id
                }).then(function (resp){
                    _this.book = resp.data
                    _this.dialogVisible = true
                })
            },
            // 点击删除
            deleteById(row){
                const _this = this;
                _this.$confirm('此操作将永久删除该数据, 是否继续?', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    axios({
                        method:"post",
                        url:"http://localhost:8080/bookMall/book/deleteById",
                        data: row.id
                    }).then(function (resp){
                        if (resp.data === "success"){
                            _this.selectAll();
                            _this.$message({
                                showClose:true,
                                message:'删除成功',
                                type:'success'
                            })
                        }
                    })
                }).catch(() => {
                    this.$message({
                        type: 'info',
                        message: '已取消删除'
                    });
                });
            },
            // 批量删除
            deleteByIds(){
                // 获取选中的数组,获取里面的id，组成一个id数组
                for (let i=0;i<this.multipleSelection.length;i++){
                    this.selectedIds[i] = this.multipleSelection[i].id;
                }

                const _this = this;
                this.$confirm('此操作将永久删除数据，是否继续？','提示',{
                    confirmButtonText:'确定',
                    cancelButtonText: '取消',
                    type:'warning'
                }).then(() => {
                    axios({
                        method:'post',
                        url:"http://localhost:8080/bookMall/book/deleteByIds",
                        data:_this.selectedIds
                    }).then(function (resp){
                        if (resp.data === 'success'){
                            // 重新查询数据
                            _this.selectAll();
                            _this.$message({
                                message:'批量删除成功',
                                type:'success'
                            })
                        }
                    })
                }).catch(() => {
                    this.$message({
                        type: 'info',
                        message: '已取消删除'
                    });
                });
            }
        }
    })
</script>
</body>
</html>
