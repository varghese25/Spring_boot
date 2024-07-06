<%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>

<html>
   <head> 
      <title>
      Varghese Webpage
     </title>
   </head>
   <body>
 Welcome to my Website!! <br>
 
 <h1> Hi this Varghese </h2>
 ${details.name}
 ${details.age} 
 ${details.address}
 
 <marquee> Page Under Construction</marquee>
 
 <center >Current Date And Time 
     <% 
         Date date = new Date();
         out.print( "<h4 align = \"aside\">" +date.toString()+"</h4>");
      %>
      </center>
     
   </body>
</html>