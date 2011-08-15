<html>
<head>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/amq_jquery_adapter.js"></script>
<script type="text/javascript" src="js/amq.js"></script>
<script type="text/javascript">
  var amq = org.activemq.Amq;
  amq.init({ 
    uri: 'amq', 
    logging: true,
    timeout: 20
  });
  var myHandler =
  {
    rcvMessage: function(message)
    {
    	$('#value').text(message.data);
    }
  };

  amq.addListener("abc","test",myHandler.rcvMessage);
</script>
</head>
<body>
<h2>Hello World!</h2>
<div id="value"></div>
</body>
</html>
