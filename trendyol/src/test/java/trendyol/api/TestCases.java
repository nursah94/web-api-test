package trendyol.api;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import static org.junit.Assert.assertEquals;
import io.restassured.path.xml.XmlPath;
import io.restassured.path.xml.XmlPath.CompatibilityMode;


public class TestCases  {

    @Test
    public void titleShouldBeTelevision() {

        Response response = get("https://www.trendyol.com/sr?q=televizyon&qt=televizyon&st=televizyon&os=1");

        int statusCod = response.getStatusCode();
        assertEquals(statusCod, 200);

        XmlPath doc = new XmlPath(CompatibilityMode.HTML,response.body().asString());

        String title = doc.getString("html.head.title");
        assertEquals("televizyon Modelleri, Fiyatları - Trendyol", title);

    }
}
