/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-11-26 04:55:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.backend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <style  scoped>\r\n");
      out.write("        *{\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("        body{\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("        }\r\n");
      out.write("        #app{\r\n");
      out.write("            position: fixed;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("        }\r\n");
      out.write("        .allHeight{\r\n");
      out.write("            height: 100%;\r\n");
      out.write("        }\r\n");
      out.write("        .el-header {\r\n");
      out.write("            background-color: #7169A2;\r\n");
      out.write("            color: #F2F6FC;\r\n");
      out.write("            line-height: 60px;\r\n");
      out.write("        }\r\n");
      out.write("        .title{\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("        }\r\n");
      out.write("        .oper{\r\n");
      out.write("            text-align: right;\r\n");
      out.write("            margin: 0 30px;\r\n");
      out.write("            float: right;\r\n");
      out.write("        }\r\n");
      out.write("        a{\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: #FF4A60;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .el-aside {\r\n");
      out.write("            background-color: #CCCFF0;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            color: #333;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            line-height: 200px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .el-main {\r\n");
      out.write("            background-color: #FFFFFF;\r\n");
      out.write("            color: #333;\r\n");
      out.write("            overflow-y: scroll;\r\n");
      out.write("        }\r\n");
      out.write("        .el-table{\r\n");
      out.write("            margin-top: 30px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body > .el-container {\r\n");
      out.write("            margin-bottom: 40px;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"app\">\r\n");
      out.write("    <el-container class=\"allHeight\">\r\n");
      out.write("        <el-header>\r\n");
      out.write("            <div class=\"title\">友谊书城管理后台</div>\r\n");
      out.write("            <div class=\"oper\">\r\n");
      out.write("                欢迎您：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("   &nbsp;&nbsp;&nbsp;  <a href=\"/bookMall/logoutServlet\">退出登录</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </el-header>\r\n");
      out.write("        <el-container>\r\n");
      out.write("            <el-aside width=\"200px\" class=\"allHeight\">\r\n");
      out.write("                <el-menu default-active=\"2\" class=\"el-menu-vertical-demo\" @open=\"handleOpen\" @close=\"handleClose\"\r\n");
      out.write("                         background-color=\"#CCCFF0\" text-color=\"#333\" active-text-color=\"#FF4A60\" default-active=\"1\">\r\n");
      out.write("                    <el-menu-item index=\"1\">\r\n");
      out.write("                        <i class=\"el-icon-menu\"></i>\r\n");
      out.write("                        <span slot=\"title\">首页</span>\r\n");
      out.write("                    </el-menu-item>\r\n");
      out.write("                    <el-menu-item\r\n");
      out.write("                            v-for=\"item in menuList\"\r\n");
      out.write("                            :index=\"item.id\"\r\n");
      out.write("                            @click=\"selectMenu(item)\">\r\n");
      out.write("                        <i :class=\"item.icon\"></i>\r\n");
      out.write("                        <span slot=\"title\">{{item.name}}</span>\r\n");
      out.write("                    </el-menu-item>\r\n");
      out.write("                </el-menu>\r\n");
      out.write("            </el-aside>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <el-main style=\"height: 877px; overflow-y: scroll\">\r\n");
      out.write("                <!--搜索表单-->\r\n");
      out.write("                <el-form :inline=\"true\" class=\"demo-form-inline\">\r\n");
      out.write("\r\n");
      out.write("                    <el-form-item label=\"书名\">\r\n");
      out.write("                        <el-input placeholder=\"书名\" v-model=\"book.title\" ></el-input>\r\n");
      out.write("                    </el-form-item>\r\n");
      out.write("\r\n");
      out.write("                    <el-form-item label=\"作者\">\r\n");
      out.write("                        <el-input placeholder=\"作者\" v-model=\"book.author\" ></el-input>\r\n");
      out.write("                    </el-form-item>\r\n");
      out.write("\r\n");
      out.write("                    <el-form-item>\r\n");
      out.write("                        <el-button type=\"primary\" @click=\"onSubmit\">查询</el-button>\r\n");
      out.write("                    </el-form-item>\r\n");
      out.write("                </el-form>\r\n");
      out.write("                <!--按钮-->\r\n");
      out.write("                <el-row>\r\n");
      out.write("                    <el-button type=\"danger\"   plain @click=\"deleteByIds\">批量删除</el-button>\r\n");
      out.write("                    <el-button type=\"primary\" plain @click=\"dialogVisible = true\">新增</el-button>\r\n");
      out.write("                </el-row>\r\n");
      out.write("                <!--添加数据对话框表单-->\r\n");
      out.write("                <el-dialog\r\n");
      out.write("                        title=\"编辑商品\"\r\n");
      out.write("                        :modal-append-to-body=\"false\"\r\n");
      out.write("                        :visible.sync=\"dialogVisible\"\r\n");
      out.write("                        width=\"30%\">\r\n");
      out.write("                    <el-form ref=\"form\" :model=\"book\" label-width=\"80px\">\r\n");
      out.write("                        <el-form-item label=\"书名\">\r\n");
      out.write("                            <el-input v-model=\"book.title\"></el-input>\r\n");
      out.write("                        </el-form-item>\r\n");
      out.write("\r\n");
      out.write("                        <el-form-item label=\"作者\">\r\n");
      out.write("                            <el-input v-model=\"book.author\"></el-input>\r\n");
      out.write("                        </el-form-item>\r\n");
      out.write("\r\n");
      out.write("                        <el-form-item label=\"简介\">\r\n");
      out.write("                            <el-input type=\"textarea\" v-model=\"book.intro\"></el-input>\r\n");
      out.write("                        </el-form-item>\r\n");
      out.write("\r\n");
      out.write("                        <el-form-item label=\"价格\">\r\n");
      out.write("                            <el-input v-model=\"book.price\"></el-input>\r\n");
      out.write("                        </el-form-item>\r\n");
      out.write("                        <el-form-item label=\"销量\">\r\n");
      out.write("                            <el-input v-model=\"book.sold\"></el-input>\r\n");
      out.write("                        </el-form-item>\r\n");
      out.write("                        <el-form-item label=\"库存\">\r\n");
      out.write("                            <el-input v-model=\"book.inventory\"></el-input>\r\n");
      out.write("                        </el-form-item>\r\n");
      out.write("\r\n");
      out.write("                        <el-form-item>\r\n");
      out.write("                            <template slot-scope=\"scope\">\r\n");
      out.write("                                <el-button type=\"primary\" @click=\"addBook(book.id)\">提交</el-button>\r\n");
      out.write("                                <el-button @click=\"dialogVisible = false\">取消</el-button>\r\n");
      out.write("                            </template>\r\n");
      out.write("                        </el-form-item>\r\n");
      out.write("                    </el-form>\r\n");
      out.write("\r\n");
      out.write("                </el-dialog>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!--表格-->\r\n");
      out.write("                <template>\r\n");
      out.write("                    <el-table\r\n");
      out.write("                            :data=\"tableData\"\r\n");
      out.write("                            style=\"width: 100%;margin-bottom: 20px;overflow: auto\"\r\n");
      out.write("                            :row-class-name=\"tableRowClassName\"\r\n");
      out.write("                            @selection-change=\"handleSelectionChange\"\r\n");
      out.write("                    >\r\n");
      out.write("                        <!--\t\t\t\t\t\t复选框-->\r\n");
      out.write("                        <el-table-column\r\n");
      out.write("                                type=\"selection\"\r\n");
      out.write("                                width=\"55\">\r\n");
      out.write("                        </el-table-column>\r\n");
      out.write("                        <!--\t\t\t\t\t\t序号-->\r\n");
      out.write("                        <el-table-column\r\n");
      out.write("                                type=\"index\"\r\n");
      out.write("                                width=\"50\">\r\n");
      out.write("                        </el-table-column>\r\n");
      out.write("\r\n");
      out.write("                        <el-table-column\r\n");
      out.write("                                prop=\"title\"\r\n");
      out.write("                                label=\"书名\"\r\n");
      out.write("                                align=\"center\"\r\n");
      out.write("                        >\r\n");
      out.write("                        </el-table-column>\r\n");
      out.write("                        <el-table-column\r\n");
      out.write("                                prop=\"author\"\r\n");
      out.write("                                label=\"作者\"\r\n");
      out.write("                                align=\"center\"\r\n");
      out.write("                        >\r\n");
      out.write("                        </el-table-column>\r\n");
      out.write("                        <el-table-column\r\n");
      out.write("                                prop=\"intro\"\r\n");
      out.write("                                show-overflow-tooltip\r\n");
      out.write("                                align=\"center\"\r\n");
      out.write("                                label=\"简介\">\r\n");
      out.write("                        </el-table-column>\r\n");
      out.write("                        <el-table-column\r\n");
      out.write("                                prop=\"price\"\r\n");
      out.write("                                align=\"center\"\r\n");
      out.write("                                label=\"价格\">\r\n");
      out.write("                        </el-table-column>\r\n");
      out.write("                        <el-table-column\r\n");
      out.write("                                prop=\"sold\"\r\n");
      out.write("                                align=\"center\"\r\n");
      out.write("                                label=\"销量\">\r\n");
      out.write("                        </el-table-column>\r\n");
      out.write("                        <el-table-column\r\n");
      out.write("                                prop=\"inventory\"\r\n");
      out.write("                                align=\"center\"\r\n");
      out.write("                                label=\"库存\">\r\n");
      out.write("                        </el-table-column>\r\n");
      out.write("\r\n");
      out.write("                        <el-table-column\r\n");
      out.write("                                align=\"center\"\r\n");
      out.write("                                label=\"操作\">\r\n");
      out.write("                            <template slot-scope=\"scope\">\r\n");
      out.write("                                <el-button type=\"primary\" @click.native.prevent=\"updateById(scope.row)\">修改</el-button>\r\n");
      out.write("                                <el-button type=\"danger\" @click.native.prevent=\"deleteById(scope.row)\">删除</el-button>\r\n");
      out.write("                            </template>\r\n");
      out.write("\r\n");
      out.write("                        </el-table-column>\r\n");
      out.write("                    </el-table>\r\n");
      out.write("                </template>\r\n");
      out.write("\r\n");
      out.write("                <!--分页工具条-->\r\n");
      out.write("                <el-pagination\r\n");
      out.write("                        @size-change=\"handleSizeChange\"\r\n");
      out.write("                        @current-change=\"handleCurrentChange\"\r\n");
      out.write("                        :current-page=\"currentPage\"\r\n");
      out.write("                        :page-sizes=\"[5, 10, 15, 20]\"\r\n");
      out.write("                        :page-size=\"pageSize\"\r\n");
      out.write("                        layout=\"total, sizes, prev, pager, next, jumper\"\r\n");
      out.write("                        :total=\"totalCount\">\r\n");
      out.write("                </el-pagination>\r\n");
      out.write("\r\n");
      out.write("            </el-main>\r\n");
      out.write("        </el-container>\r\n");
      out.write("    </el-container>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/axios-0.18.0.js\"></script>\r\n");
      out.write("<script src=\"js/vue.js\"></script>\r\n");
      out.write("<script src=\"../element-ui/lib/index.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../element-ui/lib/theme-chalk/index.css\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    new Vue({\r\n");
      out.write("        el:\"#app\",\r\n");
      out.write("        data(){\r\n");
      out.write("            return{\r\n");
      out.write("                // 复选框选中数据集合\r\n");
      out.write("                multipleSelection: [],\r\n");
      out.write("                tableData:[],\r\n");
      out.write("                // 商品模型数据\r\n");
      out.write("                book: {\r\n");
      out.write("                    title: '',\r\n");
      out.write("                    author: '',\r\n");
      out.write("                    intro:'',\r\n");
      out.write("                    price: '',\r\n");
      out.write("                    sold:'',\r\n");
      out.write("                    inventory:''\r\n");
      out.write("                },\r\n");
      out.write("                // 添加数据对话框是否展示的标记\r\n");
      out.write("                dialogVisible: false,\r\n");
      out.write("                selectedIds:[],\r\n");
      out.write("                // 当前页码\r\n");
      out.write("                currentPage: 1,\r\n");
      out.write("                pageSize: 5,\r\n");
      out.write("                totalCount:0,\r\n");
      out.write("                menuList:[\r\n");
      out.write("                    {\r\n");
      out.write("                        id:'2',\r\n");
      out.write("                        name:'关于我们',\r\n");
      out.write("                        url:'/backend/about.html',\r\n");
      out.write("                        icon:'el-icon-setting'\r\n");
      out.write("                    },\r\n");
      out.write("                    {\r\n");
      out.write("                        id:'3',\r\n");
      out.write("                        name:'test',\r\n");
      out.write("                        url:'/backend/test.html',\r\n");
      out.write("                        icon:'el-icon-setting'\r\n");
      out.write("                    }\r\n");
      out.write("                ]\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        mounted(){\r\n");
      out.write("            this.selectAll()\r\n");
      out.write("        },\r\n");
      out.write("        methods: {\r\n");
      out.write("            selectMenu(item){\r\n");
      out.write("              console.log(item)\r\n");
      out.write("            },\r\n");
      out.write("            handleOpen(key, keyPath) {\r\n");
      out.write("                console.log(key, keyPath);\r\n");
      out.write("            },\r\n");
      out.write("            handleClose(key, keyPath) {\r\n");
      out.write("                console.log(key, keyPath);\r\n");
      out.write("            },\r\n");
      out.write("            tableRowClassName({row, rowIndex}) {\r\n");
      out.write("                if (rowIndex === 1) {\r\n");
      out.write("                    return 'warning-row';\r\n");
      out.write("                } else if (rowIndex === 3) {\r\n");
      out.write("                    return 'success-row';\r\n");
      out.write("                }\r\n");
      out.write("                return '';\r\n");
      out.write("            },\r\n");
      out.write("            //分页\r\n");
      out.write("            handleSizeChange(val) {\r\n");
      out.write("                console.log(`每页 ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${val}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" 条`);\r\n");
      out.write("                this.pageSize = val;\r\n");
      out.write("                this.selectAll()\r\n");
      out.write("            },\r\n");
      out.write("            handleCurrentChange(val) {\r\n");
      out.write("                console.log(`当前页: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${val}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("`);\r\n");
      out.write("                this.currentPage = val;\r\n");
      out.write("                this.selectAll()\r\n");
      out.write("            },\r\n");
      out.write("            // 复选框选中后执行的方法\r\n");
      out.write("            handleSelectionChange(val) {\r\n");
      out.write("                this.multipleSelection = val;\r\n");
      out.write("                console.log(this.multipleSelection)\r\n");
      out.write("            },\r\n");
      out.write("            // 查询方法\r\n");
      out.write("            onSubmit() {\r\n");
      out.write("                this.selectAll()\r\n");
      out.write("            },\r\n");
      out.write("            onsubmit(){\r\n");
      out.write("                this.selectAll()\r\n");
      out.write("            },\r\n");
      out.write("            //  查询所有数据\r\n");
      out.write("            selectAll(){\r\n");
      out.write("                // 当页面加载完成后，发送异步请求请求数据\r\n");
      out.write("                axios({\r\n");
      out.write("                    method:\"post\",\r\n");
      out.write("                    url:\"http://localhost:8080/bookMall/book/selectByPageAndCondition?currentPage=\"+this.currentPage+\"&pageSize=\"+this.pageSize,\r\n");
      out.write("                    data:this.book\r\n");
      out.write("                }).then((resp)=>{\r\n");
      out.write("                    this.tableData = resp.data.rows\r\n");
      out.write("                    this.totalCount = resp.data.totalCount\r\n");
      out.write("                })\r\n");
      out.write("            },\r\n");
      out.write("            // 添加数据\r\n");
      out.write("            addBook(id){\r\n");
      out.write("                const _this = this;\r\n");
      out.write("                if (id === undefined){\r\n");
      out.write("                    // 发送ajax请求，添加异步数据\r\n");
      out.write("                    axios({\r\n");
      out.write("                        method: \"post\",\r\n");
      out.write("                        url: \"http://localhost:8080/bookMall/book/add\",\r\n");
      out.write("                        data: _this.book\r\n");
      out.write("                    }).then(function (resp) {\r\n");
      out.write("                        if (resp.data === \"success\") {\r\n");
      out.write("                            _this.dialogVisible = false;\r\n");
      out.write("                            _this.selectAll()\r\n");
      out.write("                            _this.$message({\r\n");
      out.write("                                showClose: true,\r\n");
      out.write("                                message: '添加成功',\r\n");
      out.write("                                type: 'success'\r\n");
      out.write("                            });\r\n");
      out.write("                        }\r\n");
      out.write("                        _this.book = {}\r\n");
      out.write("                    })\r\n");
      out.write("                }else{\r\n");
      out.write("                    axios({\r\n");
      out.write("                        method:\"post\",\r\n");
      out.write("                        url:\"http://localhost:8080/bookMall/book/update\",\r\n");
      out.write("                        data:_this.book\r\n");
      out.write("                    }).then(function (resp){\r\n");
      out.write("                        if (resp.data === \"success\"){\r\n");
      out.write("                            _this.dialogVisible = false\r\n");
      out.write("                            _this.selectAll()\r\n");
      out.write("                            _this.$message({\r\n");
      out.write("                                showClose: true,\r\n");
      out.write("                                message:'修改成功',\r\n");
      out.write("                                type:'success'\r\n");
      out.write("                            });\r\n");
      out.write("                            _this.book = {}  // 清空数据，避免修改后点击添加还存在数据\r\n");
      out.write("                            _this.selectAll()\r\n");
      out.write("                        }\r\n");
      out.write("                    })\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            // 点击修改\r\n");
      out.write("            updateById(row){\r\n");
      out.write("                var _this = this;\r\n");
      out.write("                axios({\r\n");
      out.write("                    method:\"get\",\r\n");
      out.write("                    url:\"http://localhost:8080/bookMall/book/selectById?id=\"+row.id\r\n");
      out.write("                }).then(function (resp){\r\n");
      out.write("                    _this.book = resp.data\r\n");
      out.write("                    _this.dialogVisible = true\r\n");
      out.write("                })\r\n");
      out.write("            },\r\n");
      out.write("            // 点击删除\r\n");
      out.write("            deleteById(row){\r\n");
      out.write("                const _this = this;\r\n");
      out.write("                _this.$confirm('此操作将永久删除该数据, 是否继续?', '提示', {\r\n");
      out.write("                    confirmButtonText: '确定',\r\n");
      out.write("                    cancelButtonText: '取消',\r\n");
      out.write("                    type: 'warning'\r\n");
      out.write("                }).then(() => {\r\n");
      out.write("                    axios({\r\n");
      out.write("                        method:\"post\",\r\n");
      out.write("                        url:\"http://localhost:8080/bookMall/book/deleteById\",\r\n");
      out.write("                        data: row.id\r\n");
      out.write("                    }).then(function (resp){\r\n");
      out.write("                        if (resp.data === \"success\"){\r\n");
      out.write("                            _this.selectAll();\r\n");
      out.write("                            _this.$message({\r\n");
      out.write("                                showClose:true,\r\n");
      out.write("                                message:'删除成功',\r\n");
      out.write("                                type:'success'\r\n");
      out.write("                            })\r\n");
      out.write("                        }\r\n");
      out.write("                    })\r\n");
      out.write("                }).catch(() => {\r\n");
      out.write("                    this.$message({\r\n");
      out.write("                        type: 'info',\r\n");
      out.write("                        message: '已取消删除'\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("            },\r\n");
      out.write("            // 批量删除\r\n");
      out.write("            deleteByIds(){\r\n");
      out.write("                // 获取选中的数组,获取里面的id，组成一个id数组\r\n");
      out.write("                for (let i=0;i<this.multipleSelection.length;i++){\r\n");
      out.write("                    this.selectedIds[i] = this.multipleSelection[i].id;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                const _this = this;\r\n");
      out.write("                this.$confirm('此操作将永久删除数据，是否继续？','提示',{\r\n");
      out.write("                    confirmButtonText:'确定',\r\n");
      out.write("                    cancelButtonText: '取消',\r\n");
      out.write("                    type:'warning'\r\n");
      out.write("                }).then(() => {\r\n");
      out.write("                    axios({\r\n");
      out.write("                        method:'post',\r\n");
      out.write("                        url:\"http://localhost:8080/bookMall/book/deleteByIds\",\r\n");
      out.write("                        data:_this.selectedIds\r\n");
      out.write("                    }).then(function (resp){\r\n");
      out.write("                        if (resp.data === 'success'){\r\n");
      out.write("                            // 重新查询数据\r\n");
      out.write("                            _this.selectAll();\r\n");
      out.write("                            _this.$message({\r\n");
      out.write("                                message:'批量删除成功',\r\n");
      out.write("                                type:'success'\r\n");
      out.write("                            })\r\n");
      out.write("                        }\r\n");
      out.write("                    })\r\n");
      out.write("                }).catch(() => {\r\n");
      out.write("                    this.$message({\r\n");
      out.write("                        type: 'info',\r\n");
      out.write("                        message: '已取消删除'\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
