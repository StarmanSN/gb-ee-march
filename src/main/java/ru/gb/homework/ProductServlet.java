package ru.gb.homework;

import org.apache.commons.lang3.RandomStringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {

    Random random = new Random();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*resp.getWriter().printf("<h2>Product id = %s; title = %s; cost = %s </h2>",
                req.getParameter("id"),
                req.getParameter("title"),
                req.getParameter("cost"));*/

        req.setAttribute("product", createProduct());
        getServletContext().getRequestDispatcher("/product.jsp")
                .forward(req, resp);
    }

    private List<Product> createProduct() {
        List<Product> products = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            String title = RandomStringUtils.randomAlphabetic(10);
            products.add(new Product(i, title, (random.nextInt(100))));
        }
        return products;
    }
}
