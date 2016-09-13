import com.onbarcode.barcode.AbstractBarcode;
import com.onbarcode.barcode.Code128;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;

public class BarcodeServlet extends HttpServlet
{
 public void doGet(HttpServletRequest request, HttpServletResponse response)
 throws ServletException
 {
  try {
   Code128 barcode = new Code128();
   barcode.setData("0123456789");

   ServletOutputStream servletoutputstream = response.getOutputStream();

   response.setContentType("image/jpeg");
   response.setHeader("Pragma", "no-cache"); 
   response.setHeader("Cache-Control", "no-cache");
   response.setDateHeader("Expires", 0);
   // Generate Code-128 barcode & output to ServletOutputStream
   barcode.drawBarcode(servletoutputstream);
  }
  catch (Exception e) {
   throw new ServletException(e);
  }
 }
}