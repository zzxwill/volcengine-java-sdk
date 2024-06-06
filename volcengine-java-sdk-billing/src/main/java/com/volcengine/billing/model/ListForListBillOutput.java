/*
 * billing
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.billing.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListForListBillOutput
 */



public class ListForListBillOutput {
  @SerializedName("BillCategoryParent")
  private String billCategoryParent = null;

  @SerializedName("BillDetailNum")
  private String billDetailNum = null;

  @SerializedName("BillID")
  private String billID = null;

  @SerializedName("BillPeriod")
  private String billPeriod = null;

  @SerializedName("BillingMode")
  private String billingMode = null;

  @SerializedName("BusiPeriod")
  private String busiPeriod = null;

  @SerializedName("BusinessMode")
  private String businessMode = null;

  @SerializedName("CouponAmount")
  private String couponAmount = null;

  @SerializedName("CreditCarriedAmount")
  private String creditCarriedAmount = null;

  @SerializedName("Currency")
  private String currency = null;

  @SerializedName("DiscountBillAmount")
  private String discountBillAmount = null;

  @SerializedName("ExpenseBeginTime")
  private String expenseBeginTime = null;

  @SerializedName("ExpenseEndTime")
  private String expenseEndTime = null;

  @SerializedName("OriginalBillAmount")
  private String originalBillAmount = null;

  @SerializedName("OwnerCustomerName")
  private String ownerCustomerName = null;

  @SerializedName("OwnerID")
  private String ownerID = null;

  @SerializedName("OwnerUserName")
  private String ownerUserName = null;

  @SerializedName("PaidAmount")
  private String paidAmount = null;

  @SerializedName("PayStatus")
  private String payStatus = null;

  @SerializedName("PayableAmount")
  private String payableAmount = null;

  @SerializedName("PayerCustomerName")
  private String payerCustomerName = null;

  @SerializedName("PayerID")
  private String payerID = null;

  @SerializedName("PayerUserName")
  private String payerUserName = null;

  @SerializedName("PreferentialBillAmount")
  private String preferentialBillAmount = null;

  @SerializedName("Product")
  private String product = null;

  @SerializedName("ProductZh")
  private String productZh = null;

  @SerializedName("RoundBillAmount")
  private String roundBillAmount = null;

  @SerializedName("SellerCustomerName")
  private String sellerCustomerName = null;

  @SerializedName("SellerID")
  private String sellerID = null;

  @SerializedName("SellerUserName")
  private String sellerUserName = null;

  @SerializedName("SettlementType")
  private String settlementType = null;

  @SerializedName("SubjectName")
  private String subjectName = null;

  @SerializedName("TradeTime")
  private String tradeTime = null;

  @SerializedName("UnpaidAmount")
  private String unpaidAmount = null;

  public ListForListBillOutput billCategoryParent(String billCategoryParent) {
    this.billCategoryParent = billCategoryParent;
    return this;
  }

   /**
   * Get billCategoryParent
   * @return billCategoryParent
  **/
  @Schema(description = "")
  public String getBillCategoryParent() {
    return billCategoryParent;
  }

  public void setBillCategoryParent(String billCategoryParent) {
    this.billCategoryParent = billCategoryParent;
  }

  public ListForListBillOutput billDetailNum(String billDetailNum) {
    this.billDetailNum = billDetailNum;
    return this;
  }

   /**
   * Get billDetailNum
   * @return billDetailNum
  **/
  @Schema(description = "")
  public String getBillDetailNum() {
    return billDetailNum;
  }

  public void setBillDetailNum(String billDetailNum) {
    this.billDetailNum = billDetailNum;
  }

  public ListForListBillOutput billID(String billID) {
    this.billID = billID;
    return this;
  }

   /**
   * Get billID
   * @return billID
  **/
  @Schema(description = "")
  public String getBillID() {
    return billID;
  }

  public void setBillID(String billID) {
    this.billID = billID;
  }

  public ListForListBillOutput billPeriod(String billPeriod) {
    this.billPeriod = billPeriod;
    return this;
  }

   /**
   * Get billPeriod
   * @return billPeriod
  **/
  @Schema(description = "")
  public String getBillPeriod() {
    return billPeriod;
  }

  public void setBillPeriod(String billPeriod) {
    this.billPeriod = billPeriod;
  }

  public ListForListBillOutput billingMode(String billingMode) {
    this.billingMode = billingMode;
    return this;
  }

   /**
   * Get billingMode
   * @return billingMode
  **/
  @Schema(description = "")
  public String getBillingMode() {
    return billingMode;
  }

  public void setBillingMode(String billingMode) {
    this.billingMode = billingMode;
  }

  public ListForListBillOutput busiPeriod(String busiPeriod) {
    this.busiPeriod = busiPeriod;
    return this;
  }

   /**
   * Get busiPeriod
   * @return busiPeriod
  **/
  @Schema(description = "")
  public String getBusiPeriod() {
    return busiPeriod;
  }

  public void setBusiPeriod(String busiPeriod) {
    this.busiPeriod = busiPeriod;
  }

  public ListForListBillOutput businessMode(String businessMode) {
    this.businessMode = businessMode;
    return this;
  }

   /**
   * Get businessMode
   * @return businessMode
  **/
  @Schema(description = "")
  public String getBusinessMode() {
    return businessMode;
  }

  public void setBusinessMode(String businessMode) {
    this.businessMode = businessMode;
  }

  public ListForListBillOutput couponAmount(String couponAmount) {
    this.couponAmount = couponAmount;
    return this;
  }

   /**
   * Get couponAmount
   * @return couponAmount
  **/
  @Schema(description = "")
  public String getCouponAmount() {
    return couponAmount;
  }

  public void setCouponAmount(String couponAmount) {
    this.couponAmount = couponAmount;
  }

  public ListForListBillOutput creditCarriedAmount(String creditCarriedAmount) {
    this.creditCarriedAmount = creditCarriedAmount;
    return this;
  }

   /**
   * Get creditCarriedAmount
   * @return creditCarriedAmount
  **/
  @Schema(description = "")
  public String getCreditCarriedAmount() {
    return creditCarriedAmount;
  }

  public void setCreditCarriedAmount(String creditCarriedAmount) {
    this.creditCarriedAmount = creditCarriedAmount;
  }

  public ListForListBillOutput currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @Schema(description = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ListForListBillOutput discountBillAmount(String discountBillAmount) {
    this.discountBillAmount = discountBillAmount;
    return this;
  }

   /**
   * Get discountBillAmount
   * @return discountBillAmount
  **/
  @Schema(description = "")
  public String getDiscountBillAmount() {
    return discountBillAmount;
  }

  public void setDiscountBillAmount(String discountBillAmount) {
    this.discountBillAmount = discountBillAmount;
  }

  public ListForListBillOutput expenseBeginTime(String expenseBeginTime) {
    this.expenseBeginTime = expenseBeginTime;
    return this;
  }

   /**
   * Get expenseBeginTime
   * @return expenseBeginTime
  **/
  @Schema(description = "")
  public String getExpenseBeginTime() {
    return expenseBeginTime;
  }

  public void setExpenseBeginTime(String expenseBeginTime) {
    this.expenseBeginTime = expenseBeginTime;
  }

  public ListForListBillOutput expenseEndTime(String expenseEndTime) {
    this.expenseEndTime = expenseEndTime;
    return this;
  }

   /**
   * Get expenseEndTime
   * @return expenseEndTime
  **/
  @Schema(description = "")
  public String getExpenseEndTime() {
    return expenseEndTime;
  }

  public void setExpenseEndTime(String expenseEndTime) {
    this.expenseEndTime = expenseEndTime;
  }

  public ListForListBillOutput originalBillAmount(String originalBillAmount) {
    this.originalBillAmount = originalBillAmount;
    return this;
  }

   /**
   * Get originalBillAmount
   * @return originalBillAmount
  **/
  @Schema(description = "")
  public String getOriginalBillAmount() {
    return originalBillAmount;
  }

  public void setOriginalBillAmount(String originalBillAmount) {
    this.originalBillAmount = originalBillAmount;
  }

  public ListForListBillOutput ownerCustomerName(String ownerCustomerName) {
    this.ownerCustomerName = ownerCustomerName;
    return this;
  }

   /**
   * Get ownerCustomerName
   * @return ownerCustomerName
  **/
  @Schema(description = "")
  public String getOwnerCustomerName() {
    return ownerCustomerName;
  }

  public void setOwnerCustomerName(String ownerCustomerName) {
    this.ownerCustomerName = ownerCustomerName;
  }

  public ListForListBillOutput ownerID(String ownerID) {
    this.ownerID = ownerID;
    return this;
  }

   /**
   * Get ownerID
   * @return ownerID
  **/
  @Schema(description = "")
  public String getOwnerID() {
    return ownerID;
  }

  public void setOwnerID(String ownerID) {
    this.ownerID = ownerID;
  }

  public ListForListBillOutput ownerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
    return this;
  }

   /**
   * Get ownerUserName
   * @return ownerUserName
  **/
  @Schema(description = "")
  public String getOwnerUserName() {
    return ownerUserName;
  }

  public void setOwnerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
  }

  public ListForListBillOutput paidAmount(String paidAmount) {
    this.paidAmount = paidAmount;
    return this;
  }

   /**
   * Get paidAmount
   * @return paidAmount
  **/
  @Schema(description = "")
  public String getPaidAmount() {
    return paidAmount;
  }

  public void setPaidAmount(String paidAmount) {
    this.paidAmount = paidAmount;
  }

  public ListForListBillOutput payStatus(String payStatus) {
    this.payStatus = payStatus;
    return this;
  }

   /**
   * Get payStatus
   * @return payStatus
  **/
  @Schema(description = "")
  public String getPayStatus() {
    return payStatus;
  }

  public void setPayStatus(String payStatus) {
    this.payStatus = payStatus;
  }

  public ListForListBillOutput payableAmount(String payableAmount) {
    this.payableAmount = payableAmount;
    return this;
  }

   /**
   * Get payableAmount
   * @return payableAmount
  **/
  @Schema(description = "")
  public String getPayableAmount() {
    return payableAmount;
  }

  public void setPayableAmount(String payableAmount) {
    this.payableAmount = payableAmount;
  }

  public ListForListBillOutput payerCustomerName(String payerCustomerName) {
    this.payerCustomerName = payerCustomerName;
    return this;
  }

   /**
   * Get payerCustomerName
   * @return payerCustomerName
  **/
  @Schema(description = "")
  public String getPayerCustomerName() {
    return payerCustomerName;
  }

  public void setPayerCustomerName(String payerCustomerName) {
    this.payerCustomerName = payerCustomerName;
  }

  public ListForListBillOutput payerID(String payerID) {
    this.payerID = payerID;
    return this;
  }

   /**
   * Get payerID
   * @return payerID
  **/
  @Schema(description = "")
  public String getPayerID() {
    return payerID;
  }

  public void setPayerID(String payerID) {
    this.payerID = payerID;
  }

  public ListForListBillOutput payerUserName(String payerUserName) {
    this.payerUserName = payerUserName;
    return this;
  }

   /**
   * Get payerUserName
   * @return payerUserName
  **/
  @Schema(description = "")
  public String getPayerUserName() {
    return payerUserName;
  }

  public void setPayerUserName(String payerUserName) {
    this.payerUserName = payerUserName;
  }

  public ListForListBillOutput preferentialBillAmount(String preferentialBillAmount) {
    this.preferentialBillAmount = preferentialBillAmount;
    return this;
  }

   /**
   * Get preferentialBillAmount
   * @return preferentialBillAmount
  **/
  @Schema(description = "")
  public String getPreferentialBillAmount() {
    return preferentialBillAmount;
  }

  public void setPreferentialBillAmount(String preferentialBillAmount) {
    this.preferentialBillAmount = preferentialBillAmount;
  }

  public ListForListBillOutput product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @Schema(description = "")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public ListForListBillOutput productZh(String productZh) {
    this.productZh = productZh;
    return this;
  }

   /**
   * Get productZh
   * @return productZh
  **/
  @Schema(description = "")
  public String getProductZh() {
    return productZh;
  }

  public void setProductZh(String productZh) {
    this.productZh = productZh;
  }

  public ListForListBillOutput roundBillAmount(String roundBillAmount) {
    this.roundBillAmount = roundBillAmount;
    return this;
  }

   /**
   * Get roundBillAmount
   * @return roundBillAmount
  **/
  @Schema(description = "")
  public String getRoundBillAmount() {
    return roundBillAmount;
  }

  public void setRoundBillAmount(String roundBillAmount) {
    this.roundBillAmount = roundBillAmount;
  }

  public ListForListBillOutput sellerCustomerName(String sellerCustomerName) {
    this.sellerCustomerName = sellerCustomerName;
    return this;
  }

   /**
   * Get sellerCustomerName
   * @return sellerCustomerName
  **/
  @Schema(description = "")
  public String getSellerCustomerName() {
    return sellerCustomerName;
  }

  public void setSellerCustomerName(String sellerCustomerName) {
    this.sellerCustomerName = sellerCustomerName;
  }

  public ListForListBillOutput sellerID(String sellerID) {
    this.sellerID = sellerID;
    return this;
  }

   /**
   * Get sellerID
   * @return sellerID
  **/
  @Schema(description = "")
  public String getSellerID() {
    return sellerID;
  }

  public void setSellerID(String sellerID) {
    this.sellerID = sellerID;
  }

  public ListForListBillOutput sellerUserName(String sellerUserName) {
    this.sellerUserName = sellerUserName;
    return this;
  }

   /**
   * Get sellerUserName
   * @return sellerUserName
  **/
  @Schema(description = "")
  public String getSellerUserName() {
    return sellerUserName;
  }

  public void setSellerUserName(String sellerUserName) {
    this.sellerUserName = sellerUserName;
  }

  public ListForListBillOutput settlementType(String settlementType) {
    this.settlementType = settlementType;
    return this;
  }

   /**
   * Get settlementType
   * @return settlementType
  **/
  @Schema(description = "")
  public String getSettlementType() {
    return settlementType;
  }

  public void setSettlementType(String settlementType) {
    this.settlementType = settlementType;
  }

  public ListForListBillOutput subjectName(String subjectName) {
    this.subjectName = subjectName;
    return this;
  }

   /**
   * Get subjectName
   * @return subjectName
  **/
  @Schema(description = "")
  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public ListForListBillOutput tradeTime(String tradeTime) {
    this.tradeTime = tradeTime;
    return this;
  }

   /**
   * Get tradeTime
   * @return tradeTime
  **/
  @Schema(description = "")
  public String getTradeTime() {
    return tradeTime;
  }

  public void setTradeTime(String tradeTime) {
    this.tradeTime = tradeTime;
  }

  public ListForListBillOutput unpaidAmount(String unpaidAmount) {
    this.unpaidAmount = unpaidAmount;
    return this;
  }

   /**
   * Get unpaidAmount
   * @return unpaidAmount
  **/
  @Schema(description = "")
  public String getUnpaidAmount() {
    return unpaidAmount;
  }

  public void setUnpaidAmount(String unpaidAmount) {
    this.unpaidAmount = unpaidAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListForListBillOutput listForListBillOutput = (ListForListBillOutput) o;
    return Objects.equals(this.billCategoryParent, listForListBillOutput.billCategoryParent) &&
        Objects.equals(this.billDetailNum, listForListBillOutput.billDetailNum) &&
        Objects.equals(this.billID, listForListBillOutput.billID) &&
        Objects.equals(this.billPeriod, listForListBillOutput.billPeriod) &&
        Objects.equals(this.billingMode, listForListBillOutput.billingMode) &&
        Objects.equals(this.busiPeriod, listForListBillOutput.busiPeriod) &&
        Objects.equals(this.businessMode, listForListBillOutput.businessMode) &&
        Objects.equals(this.couponAmount, listForListBillOutput.couponAmount) &&
        Objects.equals(this.creditCarriedAmount, listForListBillOutput.creditCarriedAmount) &&
        Objects.equals(this.currency, listForListBillOutput.currency) &&
        Objects.equals(this.discountBillAmount, listForListBillOutput.discountBillAmount) &&
        Objects.equals(this.expenseBeginTime, listForListBillOutput.expenseBeginTime) &&
        Objects.equals(this.expenseEndTime, listForListBillOutput.expenseEndTime) &&
        Objects.equals(this.originalBillAmount, listForListBillOutput.originalBillAmount) &&
        Objects.equals(this.ownerCustomerName, listForListBillOutput.ownerCustomerName) &&
        Objects.equals(this.ownerID, listForListBillOutput.ownerID) &&
        Objects.equals(this.ownerUserName, listForListBillOutput.ownerUserName) &&
        Objects.equals(this.paidAmount, listForListBillOutput.paidAmount) &&
        Objects.equals(this.payStatus, listForListBillOutput.payStatus) &&
        Objects.equals(this.payableAmount, listForListBillOutput.payableAmount) &&
        Objects.equals(this.payerCustomerName, listForListBillOutput.payerCustomerName) &&
        Objects.equals(this.payerID, listForListBillOutput.payerID) &&
        Objects.equals(this.payerUserName, listForListBillOutput.payerUserName) &&
        Objects.equals(this.preferentialBillAmount, listForListBillOutput.preferentialBillAmount) &&
        Objects.equals(this.product, listForListBillOutput.product) &&
        Objects.equals(this.productZh, listForListBillOutput.productZh) &&
        Objects.equals(this.roundBillAmount, listForListBillOutput.roundBillAmount) &&
        Objects.equals(this.sellerCustomerName, listForListBillOutput.sellerCustomerName) &&
        Objects.equals(this.sellerID, listForListBillOutput.sellerID) &&
        Objects.equals(this.sellerUserName, listForListBillOutput.sellerUserName) &&
        Objects.equals(this.settlementType, listForListBillOutput.settlementType) &&
        Objects.equals(this.subjectName, listForListBillOutput.subjectName) &&
        Objects.equals(this.tradeTime, listForListBillOutput.tradeTime) &&
        Objects.equals(this.unpaidAmount, listForListBillOutput.unpaidAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billCategoryParent, billDetailNum, billID, billPeriod, billingMode, busiPeriod, businessMode, couponAmount, creditCarriedAmount, currency, discountBillAmount, expenseBeginTime, expenseEndTime, originalBillAmount, ownerCustomerName, ownerID, ownerUserName, paidAmount, payStatus, payableAmount, payerCustomerName, payerID, payerUserName, preferentialBillAmount, product, productZh, roundBillAmount, sellerCustomerName, sellerID, sellerUserName, settlementType, subjectName, tradeTime, unpaidAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListForListBillOutput {\n");
    
    sb.append("    billCategoryParent: ").append(toIndentedString(billCategoryParent)).append("\n");
    sb.append("    billDetailNum: ").append(toIndentedString(billDetailNum)).append("\n");
    sb.append("    billID: ").append(toIndentedString(billID)).append("\n");
    sb.append("    billPeriod: ").append(toIndentedString(billPeriod)).append("\n");
    sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
    sb.append("    busiPeriod: ").append(toIndentedString(busiPeriod)).append("\n");
    sb.append("    businessMode: ").append(toIndentedString(businessMode)).append("\n");
    sb.append("    couponAmount: ").append(toIndentedString(couponAmount)).append("\n");
    sb.append("    creditCarriedAmount: ").append(toIndentedString(creditCarriedAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    discountBillAmount: ").append(toIndentedString(discountBillAmount)).append("\n");
    sb.append("    expenseBeginTime: ").append(toIndentedString(expenseBeginTime)).append("\n");
    sb.append("    expenseEndTime: ").append(toIndentedString(expenseEndTime)).append("\n");
    sb.append("    originalBillAmount: ").append(toIndentedString(originalBillAmount)).append("\n");
    sb.append("    ownerCustomerName: ").append(toIndentedString(ownerCustomerName)).append("\n");
    sb.append("    ownerID: ").append(toIndentedString(ownerID)).append("\n");
    sb.append("    ownerUserName: ").append(toIndentedString(ownerUserName)).append("\n");
    sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
    sb.append("    payStatus: ").append(toIndentedString(payStatus)).append("\n");
    sb.append("    payableAmount: ").append(toIndentedString(payableAmount)).append("\n");
    sb.append("    payerCustomerName: ").append(toIndentedString(payerCustomerName)).append("\n");
    sb.append("    payerID: ").append(toIndentedString(payerID)).append("\n");
    sb.append("    payerUserName: ").append(toIndentedString(payerUserName)).append("\n");
    sb.append("    preferentialBillAmount: ").append(toIndentedString(preferentialBillAmount)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productZh: ").append(toIndentedString(productZh)).append("\n");
    sb.append("    roundBillAmount: ").append(toIndentedString(roundBillAmount)).append("\n");
    sb.append("    sellerCustomerName: ").append(toIndentedString(sellerCustomerName)).append("\n");
    sb.append("    sellerID: ").append(toIndentedString(sellerID)).append("\n");
    sb.append("    sellerUserName: ").append(toIndentedString(sellerUserName)).append("\n");
    sb.append("    settlementType: ").append(toIndentedString(settlementType)).append("\n");
    sb.append("    subjectName: ").append(toIndentedString(subjectName)).append("\n");
    sb.append("    tradeTime: ").append(toIndentedString(tradeTime)).append("\n");
    sb.append("    unpaidAmount: ").append(toIndentedString(unpaidAmount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
