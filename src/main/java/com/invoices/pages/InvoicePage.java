package com.invoices.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InvoicePage extends BasePageObject {

    private By orderId = By.xpath("//*[contains(text(),'146566')]");
    private By invoiceAddress = By.xpath("//td[text()='146566']/ancestor::tr[@class='gl-1']");
    private By grade = By.xpath("//td[text()='146566']/following::tbody[1]");
    private By weight = By.xpath("//td[text()='146566']/following::tbody[1]");
    private By company = By.xpath("//*[@class='gl-0 tgl eo ui-selectee'][2]//*[contains(text(),'TEST CUSTOMER')]");
    private By priceEntityFlatCharge = By.xpath("//td[text()='146566']/following::tbody[2]");
    private By priceEntityPerTonne = By.xpath("//td[text()='146566']/following::tbody[3]");
    private By priceEntityItem = By.xpath("//td[text()='146566']/following::tbody[5]");

    public InvoicePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private String pageUrl = "localhost";

    /**
     * Open InvoicePage with it's url
     */
    public void openPage() {
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("Page opened!");
    }

    /**
     * Get text from Order Id field
     */
    public String getOrderIdText() {
        String text = find(orderId).getText();
        log.info("Text from Invoices Table: " + text);
        return text;
    }

    /**
     * Get text from Invoice Address field
     */
    public String getInvoiceAddress() {
        String text = find(invoiceAddress).getText();
        log.info("Text from Invoices Table: " + text);
        return text;
    }

    /**
     * Get text from Grade field
     */
    public String getGrade() {
        String text = find(grade).getText();
        log.info("Text from Invoices Table: " + text);
        return text;
    }

    /**
     * Get text from Weight field
     */
    public String getWeight() {
        String text = find(weight).getText();
        log.info("Text from Invoices Table: " + text);
        return text;
    }

    /**
     * Get text from Company field
     */
    public String getCompany() {
        String text = find(company).getText();
        log.info("Text from Invoices Table: " + text);
        return text;
    }

    /**
     * Get text from Price Entity Flat Charge field
     */
    public String getPriceEntityFlatCharge() {
        String text = find(priceEntityFlatCharge).getText();
        log.info("Text from Invoices Table: " + text);
        return text;
    }

    /**
     * Get text from Price Entity Per Tonne field
     */
    public String getPriceEntityPerTonne() {
        String text = find(priceEntityPerTonne).getText();
        log.info("Text from Invoices Table: " + text);
        return text;
    }

    /**
     * Get text from Price Entity Item field
     */
    public String getPriceEntityItem() {
        String text = find(priceEntityItem).getText();
        log.info("Text from Invoices Table: " + text);
        return text;
    }
}
