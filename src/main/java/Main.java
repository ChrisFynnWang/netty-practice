import com.headfirst.decoratorPattern.inputstream.MyInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.util.DigestUtils;

public class Main {

  public static void main(String[] args) {
    List<String> strlist = new ArrayList<>();
    strlist.add("good");
    List<Object> objlist = new ArrayList<>();
    objlist.add(new Object());
    getdata(objlist);
    getdata(strlist);
    int[] arr = new int[289];
    arr[1] = 8;
    arr[2] = 21;
    arr[3] = 82;
    arr[4] = 18;
    arr[5] = 822;
    arr[6] = 82;
    arr[7] = 12;
    Arrays.sort(arr);
    System.out.println(arr);
    for (int x : arr) {
      System.out.println(x);
    }
  }


  public static void getdata(List<?> list) {
    System.out.println("date is : " + list.get(0).toString());
  }


  @Test
  public void testInputStream() throws IOException {

    String name = "CHRIS";

    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(name.getBytes());
    MyInputStream myInputStream = new MyInputStream(byteArrayInputStream);
    int read = myInputStream.read();
    System.out.println(read);
    read = myInputStream.read();
    System.out.println(read);
    read = myInputStream.read();
    System.out.println(read);
    read = myInputStream.read();
    System.out.println(read);
    read = myInputStream.read();
    System.out.println(read);
  }

  @Test
  public void md5Test() {
    String s = DigestUtils.md5DigestAsHex("123456".getBytes());
    System.out.println(s);
    String s1 = org.apache.commons.codec.digest.DigestUtils.md5Hex("123456");
    String s2 = org.apache.commons.codec.digest.DigestUtils.md5Hex("111111111111111111111");
    System.out.println(s1);
    System.out.println(s2);
    Date date = new Date();
    System.out.println(date);
    System.out.println(RandomStringUtils.randomNumeric(3));
    DateTime dateTime = new DateTime();

    System.out.println(dateTime.toString("yyyyMMddHHmmss"));
  }


  @Test
  public void stringTest() {
    String s = StringUtils
        .substringAfter("C:\\upload\\images\\2018\\04\\18\\201804181111.jpg", "C:\\upload");
    System.out.println(s);
  }
}
