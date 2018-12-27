<%--
  Created by IntelliJ IDEA.
  User: DruidKuma
  Date: 7/29/15
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- JS -->
<script src="/static/js/jquery.js"></script> <!-- jQuery -->
<script src="/static/js/bootstrap.min.js"></script> <!-- Bootstrap -->
<script src="/static/js/jquery-ui.min.js"></script> <!-- jQuery UI -->

<!-- jQuery Flot -->
<script src="/static/js/excanvas.min.js"></script>
<script src="/static/js/jquery.flot.js"></script>
<script src="/static/js/jquery.flot.resize.js"></script>
<script src="/static/js/jquery.flot.pie.js"></script>
<script src="/static/js/jquery.flot.stack.js"></script>

<script src="/static/js/custom.js"></script> <!-- Custom codes -->

<!-- Bootstrap File Input -->
<script src="/static/js/fileinput.js"></script>

<script src="/static/js/sweetalert2.all.min.js"></script>
<script src="/static/js/jquery.dataTables.min.js"></script>
<script src="/static/js/bootbox.min.js"></script>
<script src="/static/js/bootstrap-datepicker.js"></script>

<script>
    $('#error-flow').hide();
    function handleAdditionalErrorFlow() {
        $('#error-flow').show();
    }

    $('#error-flow').on('click', function() {
        $('footer').append('<div style="position: fixed; left: 0; top: 20%; z-index: 60"> <img src="/static/img/eLw7m.gif"> </div>');
        $('#error-flow').hide();
    });
</script>



