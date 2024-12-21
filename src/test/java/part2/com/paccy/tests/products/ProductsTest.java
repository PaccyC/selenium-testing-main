package part2.com.paccy.tests.products;

import com.paccy.saucedemo.pages.ProductsPage;

import org.testng.annotations.Test;
import part2.com.paccy.base.BaseTest;

import static org.testng.Assert.assertTrue;


public class ProductsTest extends BaseTest {

    @Test
    public void  testProductsPageShouldDisplayProductsHeader() {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        assertTrue(productsPage.isProductsHeaderDisplayed());
    }
}
