<%--
  Created by IntelliJ IDEA.
  User: DruidKuma
  Date: 7/29/15
  Time: 4:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="navbar navbar-fixed-top bs-docs-nav" role="banner">

    <div class="conjtainer">
        <!-- Menu button for smallar screens -->
        <div class="navbar-header">
            <button class="navbar-toggle btn-navbar" type="button" data-toggle="collapse" data-target=".bs-navbar-collapse">
                <span>Menu</span>
            </button>
            <!-- Site name for smallar screens -->
            <a href="/" class="navbar-brand hidden-lg">Delti Label</a>
        </div>



        <!-- Navigation starts -->
        <nav class="collapse navbar-collapse bs-navbar-collapse" role="navigation">

            <!-- Links -->
            <ul class="nav navbar-nav pull-right">
                <li class="dropdown pull-right">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <i class="fa fa-user"></i> Admin <b class="caret"></b>
                    </a>

                    <!-- Dropdown menu -->
                    <ul class="dropdown-menu">
                        <li><a href="/"><i class="fa fa-home"></i> Home</a></li>
                        <li><a href="/settings"><i class="fa fa-cogs"></i> Settings</a></li>
                        <li>
                            <a href="#" class="logout-link"><i class="fa fa-external-link"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </nav>

    </div>
</div>


<!-- Header starts -->
<header>
    <div class="container">
        <div class="row">

            <!-- Logo section -->
            <div class="col-md-4">
                <!-- Logo. -->
                <div class="logo">
                    <h1><a href="#">Delti<span class="bold">Label</span></a></h1>
                    <p class="meta">Parcel Label Generator</p>
                </div>
                <!-- Logo ends -->
            </div>

        </div>
    </div>
</header>

<!-- Header ends -->
