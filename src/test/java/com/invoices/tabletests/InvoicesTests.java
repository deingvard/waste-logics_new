package com.invoices.tabletests;

import com.invoices.base.TestUtilities;
import com.invoices.pages.InvoicePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvoicesTests extends TestUtilities {

    @Test
    public void defaultInvoiceValueTest() {
        log.info("Starting defaultInvoiceValueTest");

        InvoicePage invoicePage = new InvoicePage(driver, log);
        // open Company invoices page
        invoicePage.openPage();

        // Get default Order Id text
        String orderIdText = invoicePage.getOrderIdText();
        // Verification that page contains expected text in source
        Assert.assertTrue(orderIdText.contains("146566"),
                "Invoices default text is not expected. It is: " + orderIdText);

        // Get default Invoice Address text
        String invoiceAddressText = invoicePage.getInvoiceAddress();
        // Verification that page contains expected text in source
        Assert.assertTrue(invoiceAddressText.contains("TEST ADDRESS, TEST TOWN, 111111"),
                "Invoices default text is not expected. It is: " + invoiceAddressText);

        // Get default Grade text
        String gradeText = invoicePage.getGrade();
        // Verification that page contains expected text in source
        Assert.assertTrue(gradeText.contains("Mixed Municipal Waste"),
                "Invoices default text is not expected. It is: " + gradeText);

        // Get default Weight text
        String weightText = invoicePage.getWeight();
        // Verification that page contains expected text in source
        Assert.assertTrue(weightText.contains("0.460 T"),
                "Invoices default text is not expected. It is: " + weightText);

        // Get default Company text
        String companyText = invoicePage.getCompany();
        // Verification that page contains expected text in source
        Assert.assertTrue(companyText.contains("TEST CUSTOMER"),
                "Invoices default text is not expected. It is: " + companyText);

        // Get default Price Entity Flat Charge text
        String priceEntityFlatChargeText = invoicePage.getPriceEntityFlatCharge();
        // Verification that page contains expected text in source
        Assert.assertTrue(priceEntityFlatChargeText.contains("£100.00"),
                "Invoices default text is not expected. It is: " + priceEntityFlatChargeText);

        // Get default Price Entity Per Tonne text
        String priceEntityPerTonneText = invoicePage.getPriceEntityPerTonne();
        // Verification that page contains expected text in source
        Assert.assertTrue(priceEntityPerTonneText.contains("£4.60"),
                "Invoices default text is not expected. It is: " + priceEntityPerTonneText);

        // Get default Price Entity Item text
        String priceEntityItemText = invoicePage.getPriceEntityItem();
        // Verification that page contains expected text in source
        Assert.assertTrue(priceEntityItemText.contains("£110.10"),
                "Invoices default text is not expected. It is: " + priceEntityItemText);
    }
}
