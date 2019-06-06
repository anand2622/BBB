package com.bbb.automation.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class EnvConfig {

    public static final String Hub_URL = "";
    public static final String CHROME_DRIVER_PATH = "bin//chromedriver.exe";
    public static final String IE_DRIVER_PATH = "bin//IEDriverServer.exe";
    public static final String FIREFOX_NIGHTLY_PATH = "bin//firefox.exe";

    public static final int DEFAULT_TIMEOUT = 90;
    public static final int VISIBILITY_TIMEOUT = 45;
    public static final int VISIBILITY_TIMEOUT_IE = 60;
    public static int VISIBILITY_TIMEOUT_Variable = 90;
    public static String testBrowser = "";
    public static String Device;
    public static String Concept;
    public static String Env;
    public static String CMS_Data_id_US;
    public static String CMS_Data_id_BABY;
    public static String Omniture;
    public static String FreeShippingBadge1;
    public static String successBodyJson;
    public static String LoginAPICustomerUserIdForCreateAccount;
    public static String LoginAPICustomerPasswordIdForCreateAccount;
    public static String Incorrect_Username;
    public static String Incorrect_Password;
    public static String PersonalizedSKUIDAPI;
    public static String PersonalizedProductIDAPI;
    public static String ApiCategoryId_US;
    public static String ApiCategoryId_BABY;
    public static String PrefStore_US;
    public static String PrefStore_BABY;
    public static String PrefStore_CA;
    public static String ApiCategoryId_CA;
    public static String FreeShippingBadge2;
    public static String url_Site_US;
    public static String url_Api_US;
    public static String url_Site_Baby;
    public static String url_Api_Baby;
    public static String promoBannerBodyJson;
    public static String url_Site_CA;
    public static String url_Api_CA;
    public static String url_Site_US_TBS;
    public static String url_Api_US_TBS;
    public static String url_Site_Baby_TBS;
    public static String url_Api_Baby_TBS;
    public static String url_Site_CA_TBS;
    public static String url_Api_CA_TBS;
    public static String NewZipCode;
    public static String Correct_Password;
    public static String Correct_Username;
    public static String urlSite;
    public static String urlApi;
    public static String Browser;
    public static String password;
    public static String MultiSKUColorAndSize_US;
    public static String MultiSKUColorAndSize_Baby;
    public static String MultiSKUColorAndSize_CA;
    public static String LTLSingleSKUAbove49_Baby;
    public static String LTLSingleSKUAbove49_US;
    public static String refinedSearchKeyword;
    public static String searchKeyword;
    public static String Firstname;
    public static String InCartLabelMiniCart;
    public static String MultiSKU_QuickView_BabyNonInternationalRestricted;
    public static String PO_BOX_AddressSearchTextCompleteUS;
    public static String Lastname;
    public static String ZipCode;
    public static String HubURL;
    public static String GiftCardNoErrorMessage;
    public static String GiftCardPINErrorMessage;
    public static String GiftCardBalanceRedirectURL;
    public static String WriteAReview_US;
    public static String WriteAReview_CA;
    public static String WriteAReview_Baby;
    public static String Address1;
    public static String InCart_No_Was_SS_US;
    public static String PaypalCouponPassword;
    public static String InCart_No_Was_SS_CA;
    public static String InCart_No_Was_SS_Baby;
    public static String CityName;
    public static String FirstnameIntl;
    public static String LastnameIntl;
    public static String Address1Intl;
    public static String CityNameIntl;
    public static String CountryName;
    public static String ZipIntl;
    public static String EmailIntl;
    public static String Zip;
    public static String PostalCode;
    public static String StateName;
    public static String Province;
    public static String Email;
    public static String ConfirmEmail;
    public static String SearchDefaultText;
    public static String PhoneNumber;
    public static String PhoneNumberIntl;
    public static String CardType;
    public static String CardMonth;
    public static String CardMonthIntl;
    public static String Second_BOPUS;
    public static String Second_BOPUS_Baby;
    public static String Second_BOPUS_CA;
    public static String CardYear;
    public static String CardNumber;
    public static String CardNumberMaster;
    public static String SecurityCode;
    public static String NameOnCard;
    public static String Zip_FIS;
    public static String RegistryNumber_US;
    public static String RegistryNumber_Baby;
    public static String RegistryNumber_CA;
    public static String Company;
    public static String InCart_YES_Was_SS_US;
    public static String InCart_YES_Was_SS_Baby;
    public static String InCart_YES_Was_SS_CA;
    public static String InCart_YES_Was_EximPB_MS_US;
    public static String InCart_YES_Was_EximPB_MS_Baby;
    public static String InCart_YES_Was_EximPB_MS_CA;
    public static String InCart_YES_Orig_EximPY_MS_US;
    public static String InCart_YES_Orig_EximPY_MS_Baby;
    public static String InCart_YES_Orig_EximPY_MS_CA;
    public static String ViewMoreLinkProductTab_US;
    public static String ViewMoreLinkProductTab_Baby;
    public static String ViewMoreLinkProductTab_CA;
    public static String CountryNameAMEX;
    public static String CardNumber_AMEX;
    public static String AMEX_Card_Type;
    public static String url_EndPointURLPrice;
    public static String url_EndPointURLInventory;
    public static String url_EndPointURLCreditCard;
    public static String url_EndPointURLSession;
    public static String url_EndPointURLReview;
    public static String url_EndPointURLLogin;
    public static String[] ProductVariantOptionsAttributes;
    public static String ProductVariantOptionsAttributePath;
    public static String[] ProductIncorrectMappingCommonAttributes;
    public static String USAddressLine;
    public static String USZipCode;
    public static String USCity;
    public static String USState;
    public static String CAAddressLine;
    public static String CAZipCode;
    public static String CACity;
    public static String CAState;
    public static String EmailUpdate;
    public static String FirstnameUpdate;
    public static String SpecialCharFirstName;
    public static String LastnameUpdate;
    public static String PasswordUpdate;
    public static String FaceBookEmail;
    public static String FaceBookPassword;
    public static String Color;
    public static String DeliveryMethod;
    public static String Bedding_Search;
    public static String ValidProductId;
    public static String ValidProductBabyId;
    public static String ValidProductCAId;
    public static String InvalidProductId;
    public static String Creditcardpage_URL;
    public static String RegularProductId;
    public static String MappedChecklist;
    public static String RegularProductBabyId;
    public static String RegularProductCAId;
    public static String BOPUSProductId;
    public static String BOPUSProductBabyId;
    public static String BOPUSProductCAId;
    public static String AccessoryProductId;
    public static String AccessoryProductBabyId;
    public static String AccessoryProductCAId;
    public static String LTLProductId;
    public static String LTLProductBabyId;
    public static String CollectionProductId;
    public static String CollectionProductBabyId;
    public static String CollectionProductCAId;
    public static String MultiSKUProductId;
    public static String ProductKeyword;
    public static String ProductKeywordBaby;
    public static String ProductKeywordCA;
    public static String MultiSKUBabyId;
    public static String MultiSKUCAId;
    public static String FirstCardType;
    public static String FirstCardNumber;
    public static String FirstCardSecurityCode;
    public static String SecondCardType;
    public static String SecondCardNumber;
    public static String CountryName_Bermuda;
    public static String SecondCardSecurityCode;
    public static String VBVCardType;
    public static String VBVCardNumber;
    public static String VBVCardSecurityCode;
    public static String VBVAuthFailCardType;
    public static String VBVAuthFailCardNumber;
    public static String VBVAuthFailCardSecurityCode;
    public static String WeddingRegistry;
    public static String CommitmentCeremonyRegistry;
    public static String BabyRegistry;
    public static String HousewarmingRegistry;
    public static String AnniversaryRegistry;
    public static String UniversityRegistry;
    public static String BirthdayRegistry;
    public static String RetirementRegistry;
    public static String OtherRegistry;
    public static String Standard_Method;
    public static String Expedited_Method;
    public static String Express_Method;
    public static String PaypalEmail;
    public static String PaypalEmailCA;
    public static String PaypalPassword;
    public static String GiftCardNumber;
    public static String GiftCardPin;
    public static String GiftMessage;
    public static String ProductQuantity;
    public static String PLPSortByValue;
    public static String validAddress1;
    public static String validCityName;
    public static String validZip;
    public static String validStateName;
    public static String validAddress1CA;
    public static String validAddress2CA;
    public static String validCityNameCA;
    public static String validZipCA;
    public static String validStateNameCA;
    public static String VDC_CA;
    public static String Size;
    public static String InternationalRestrictedRegular;
    public static String InternationalRestrictedRegularBaby;
    public static String InternationalRestrictedCollection;
    public static String InternationalRestrictedCollectionBaby;
    public static String InternationalRestrictedAccessory;
    public static String InternationalRestrictedAccessoryBaby;
    public static String ReviewDetailedTextField;
    public static String ReviewTitle;
    public static String NickName;
    public static String refinedSearchInvalidKeyword;
    public static String refinedSearchOneResult;
    public static String L2_Keyword;
    public static String L2_KeywordBaby;
    public static String L2_KeywordCA;
    public static String Brand_Keyword;
    public static String Brand_KeywordBaby;
    public static String Brand_KeywordCA;
    public static String Department_Keyword;
    public static String Department_KeywordBaby;
    public static String Department_KeywordCA;
    public static String Keyword_Redirect_Text;
    public static String Keyword_Redirect_TextBaby;
    public static String Keyword_Redirect_TextCA;
    public static String Keyword_Redirect_Facet_Applied;
    public static String Keyword_Redirect_Facet_AppliedBaby;
    public static String Keyword_Redirect_Facet_AppliedCA;
    public static String FriendEmail;
    public static String FriendEmail_New;
    public static String VDC;
    public static String VDCBabyId;
    public static String VDC_LearnMoreMessage;
    public static String VDC_LearnMoreMessageSecond;
    public static String VDC_OffsetMessageMultiship;
    public static String AnotherZipCode;
    public static String EditAddressFirstname;
    public static String EditAddressLastname;
    public static String newResetpassword;
    public static String resetConfirmPassword;
    public static String Personalized_SingleSKU_PB_US;
    public static String Personalized_SingleSKU_PB_Baby;
    public static String Personalized_SingleSKU_PB_CA;
    public static String Personalized_SingleSKU_PY_US;
    public static String Personalized_SingleSKU_PY_Baby;
    public static String Personalized_SingleSKU_PY_CA;
    public static String Personalized_SingleSKU_CR_US;
    public static String Personalized_SingleSKU_CR_Baby;
    public static String Personalized_SingleSKU_CR_CA;
    public static String Personalized_MultiSKU_PY_US;
    public static String Personalized_MultiSKU_PY_Baby;
    public static String Personalized_MultiSKU_PY_CA;
    public static String Personalized_AccessoryLeadMultiSKU_CR_US;
    public static String Personalized_AccessoryLeadMultiSKU_CR_Baby;
    public static String Personalized_AccessoryLeadMultiSKU_CR_CA;
    public static String Personalized_AccessoryChildSingleSKU_PB_US;
    public static String Personalized_AccessoryChildSingleSKU_PB_Baby;
    public static String Personalized_AccessoryChildSingleSKU_PB_CA;
    public static String AccessoryProductTitle_US;
    public static String AccessoryProductTitle_Baby;
    public static String AccessoryProductTitle_CA;
    public static String Personalized_CollectionMultiSKU_CR_US;
    public static String Personalized_CollectionMultiSKU_CR_Baby;
    public static String Personalized_CollectionMultiSKU_CR_CA;
    public static String CollectionProductTitle_US;
    public static String CollectionProductTitle_Baby;
    public static String CollectionProductTitle_CA;
    public static String validAddress2;
    public static String validCityName2;
    public static String validZip2;
    public static String validStateName2;
    public static String validAddress1CA2;
    public static String validCityNameCA2;
    public static String validZipCA2;
    public static String validStateNameCA2;
    public static String partialSearchKeyword_US;
    public static String partialSearchKeyword_Baby;
    public static String partialSearchKeyword_CA;
    public static String refinedSearchKeywordForPartialResult;
    public static String refinedSearchKeywordForPartialResultUS;
    public static String Registry;
    public static String RegistryBaby;
    public static String RegistryCA;
    public static List<List<String>> GiftCards = new ArrayList<List<String>>();
    public static String GiftCard25Number;
    public static String GiftCard25Pin;
    public static String BlackColorMultiSku;
    public static String ExpandableColorMultiSKU_Baby;
    public static String ExpandableColorMultiSKU;
    public static String MultiSKU_QuickView_US;
    public static String MultiSKU_QuickView_Baby;
    public static String MultiSKU_QuickView_CA;
    public static String Address2;
    public static String CityName1;
    public static String VideoandGuidesAndAdvice;
    public static String VideoandGuidesAndAdvice_Baby;
    public static String GiftCardInvalidNumber;
    public static String GiftCardInvalidPin;
    public static String BopusDisabled;
    public static String BopusDisabledBabyId;
    public static String BopusDisabledCAId;

    public static String VBVCyberAuthUFailCardType;
    public static String VBVCyberAuthUFailCardNumber;
    public static String VBVCyberAuthUFailCardSecurityCode;
    public static String VBVAuthTimeoutCardType;
    public static String VBVAuthTimeoutCardNumber;
    public static String VBVAuthTimeoutCardSecurityCode;
    public static String VBVLookupTimeoutCardType;
    public static String VBVLookupTimeoutCardNumber;
    public static String VBVLookupTimeoutCardSecurityCode;
    public static String VBVSignAFailCardType;
    public static String VBVSignAFailCardNumber;
    public static String VBVSignAFailCardSecurityCode;
    public static String VBVSignUFailCardType;
    public static String VBVSignUFailCardNumber;
    public static String VBVSignUFailCardSecurityCode;
    public static String VBVSignAuthFailCardType;
    public static String VBVSignAuthFailCardNumber;
    public static String VBVSignAuthFailCardSecurityCode;
    public static String VBVRefreshFailCardType;
    public static String VBVRefreshFailCardNumber;
    public static String VBVRefreshFailCardSecurityCode;
    public static String AccessorySingleSKUProductTitle_US;
    public static String AccessorySingleSKUProductTitle_Baby;
    public static String AccessorySingleSKUProductTitle_CA;
    public static String sorByNewest;
    public static String pagFilterValue;
    public static String RegularSFL1_US;
    public static String RegularSFL1_Baby;
    public static String RegularSFL1_CA;
    public static String RegularSFL2_US;
    public static String RegularSFL2_Baby;
    public static String RegularSFL2_CA;
    public static String RegularSFL3_US;
    public static String RegularSFL3_Baby;
    public static String RegularSFL3_CA;
    public static String RegularSFL4_US;
    public static String RegularSFL4_Baby;
    public static String RegularSFL4_CA;
    public static String RegularSFL5_US;
    public static String RegularSFL5_Baby;
    public static String RegularSFL5_CA;
    public static String RegularSFL6_US;
    public static String RegularSFL6_Baby;
    public static String RegularSFL6_CA;
    public static String RegularSFL7_US;
    public static String RegularSFL7_Baby;
    public static String RegularSFL7_CA;
    public static String RegularSFL8_US;
    public static String RegularSFL8_Baby;
    public static String RegularSFL8_CA;
    public static String RegularSFL9_US;
    public static String RegularSFL9_Baby;
    public static String RegularSFL9_CA;
    public static String BOPUS_ShipThisOOS_US;
    public static String BOPUS_ShipThisOOS_Baby;
    public static String BOPUS_ShipThisOOS_CA;
    public static String VDC_ShipThisOOS_US;
    public static String VDC_ShipThisOOS_Baby;
    public static String VDC_ShipThisOOS_CA;
    public static String CouponEmail;
    public static String CountryMexico;
    public static String StateNameIntl;

    public static String OutOfStockSingleSKUBaby;
    public static String OutOfStockMultiSKUBaby;
    public static String OutOfStockLTLBaby;
    public static String OutOfStockLeadBaby;
    public static String OutOfStockCollectionBaby;
    public static String OutOfStockSingleSKUCA;
    public static String OutOfStockMultiSKUCA;
    public static String OutOfStockLeadCA;
    public static String OutOfStockCollectionCA;
    public static String OutOfStockSingleSKU;
    public static String OutOfStockMultiSKU;
    public static String OutOfStockLTL;
    public static String OutOfStockLead;
    public static String OutOfStockCollection;
    public static String Two_Characters;
    public static String One_Character;
    public static String PaypalCouponEmail;
    public static String RestrictedCityName;
    public static String RestrictedZip;
    public static String Zip_RestrictedProductId;
    public static String Zip_RestrictedProductBabyId;
    public static String Expedited_RestrictedProductId;
    public static String Expedited_RestrictedProductBabyId;
    public static String RestrictedStateName;
    public static String CartItemFlaggedoff_EmailID;
    public static String invalid_product;
    public static String CartItemFlaggedoffRegistry_EmailID;
    public static String SFLItemFlaggedoff_EmailID;
    public static String SFLItemNonBopusFlaggedoff_EmailID;
    public static String CartItemFlaggedoff_EmailIDBaby;
    public static String CartItemFlaggedoffRegistry_EmailIDBaby;
    public static String SFLItemFlaggedoff_EmailIDBaby;
    public static String SFLItemNonBopusFlaggedoff_EmailIDBaby;
    public static String CartItemFlaggedoff_EmailIDCA;
    public static String CartItemFlaggedoffRegistry_EmailIDCA;
    public static String SFLItemFlaggedoff_EmailIDCA;
    public static String SFLItemNonBopusFlaggedoff_EmailIDCA;
    public static String CartOOSREgistryItem_US;
    public static String CartOOSREgistryItem_Baby;
    public static String CartOOSREgistryItem_CA;
    public static String AccessoryMultiSKURangeAboveAndBelow49_Baby;
    public static String AccessorySingleSKUAbove49_Baby;
    public static String CollectionProductRangeBelow49_Baby;
    public static String CollectionProductRangeAboveAndBelow49_Baby;
    public static String MultiSKURangeAboveAndBelow49_Baby;
    public static String partialBodyJson;
    public static String SingleSKUAbove49_Baby;
    public static String AccessoryMultiSKURangeAboveAndBelow49_CA;
    public static String AccessorySingleSKUAbove49_CA;
    public static String CollectionProductRangeBelow49_CA;
    public static String CollectionProductRangeAboveAndBelow49_CA;
    public static String MultiSKURangeAboveAndBelow49_CA;
    public static String SingleSKUAbove49_CA;
    public static String AccessoryMultiSKURangeAboveAndBelow49_US;
    public static String AccessorySingleSKUAbove49_US;
    public static String CollectionProductRangeBelow49_US;
    public static String CollectionProductRangeAboveAndBelow49_US;
    public static String MultiSKURangeAboveAndBelow49_US;
    public static String SingleSKUAbove49_US;
    public static String AppointmentZip;
    public static String GuestRegistryIdHavingRequiredItems_US;
    public static String GuestRegistryIdHavingRequiredItems_Baby;
    public static String GuestRegistryIdHavingRequiredItems_CA;
    public static String InternationalRestrictedMultiSKU_US;
    public static String InternationalRestrictedMultiSKU_Baby;
    public static String ItemHavingSwatchesLessThan5_Baby;
    public static String ItemHavingSwatchesLessThan5_CA;
    public static String ItemHavingSwatchesLessThan5_US;
    public static String ItemHavingSwatchesEqualTo7_Baby;
    public static String ItemHavingSwatchesEqualTo7_CA;
    public static String ItemHavingSwatchesEqualTo7_US;
    public static String ItemHavingSwatchesMoreThan7_Baby;
    public static String ItemHavingSwatchesMoreThan7_CA;
    public static String ItemHavingSwatchesMoreThan7_US;
    public static String ItemHavingSwatchesEqualTo5_Baby;
    public static String ItemHavingSwatchesEqualTo5_CA;
    public static String ItemHavingSwatchesEqualTo5_US;
    public static String PartialSearchKeywordHavingSwatches_US;
    public static String PartialSearchKeywordHavingSwatches_CA;
    public static String PartialSearchKeywordHavingSwatches_Baby;
    public static String ItemHavingFinishSwatches_US;
    public static String ItemHavingFinishSwatches_Baby;
    public static String ItemHavingFinishSwatches_CA;
    public static String CollectionItemHavingSwatchesMoreThan11WithSizeDropDown_US;
    public static String CollectionItemHavingSwatchesMoreThan11WithSizeDropDown_Baby;
    public static String CollectionItemHavingSwatchesMoreThan11WithSizeDropDown_CA;
    public static String AccessoryChildItemHavingColorSwatches_US;
    public static String AccessoryChildItemHavingColorSwatches_Baby;
    public static String AccessoryChildItemHavingColorSwatches_CA;
    public static String ItemColorSwatch_US;
    public static String ItemColorSwatch_Baby;
    public static String ItemColorSwatch_CA;
    public static String RegistryNumber2_US;
    public static String RegistryNumber2_Baby;
    public static String RegistryNumber2_CA;
    public static String EverlivingProduct;
    public static String omnitureUserEmail;
    public static String CouponEmailOmniture;
    public static String ProductWithOmniProm123AttachedId;
    public static String ProductWithSurchargeId;
    public static String NotReserveOnline_BOPUS_US;
    public static String NotReserveOnline_BOPUS_Baby;
    public static String NotReserveOnline_BOPUS_CA;
    public static String OutOfStock_BOPUS_US;
    public static String OutOfStock_BOPUS_Baby;
    public static String OutOfStock_BOPUS_CA;
    public static String Zip_FindInStore;
    public static String LowStockQuantity1_BOPUS_US;
    public static String LowStockQuantity1_BOPUS_Baby;
    public static String LowStockQuantity1_BOPUS_CA;
    public static String ZipLowStockQuantity1_US;
    public static String ZipLowStockQuantity1_Baby;
    public static String ZipLowStockQuantity1_CA;
    public static String ValidZipCA_ReserveOnline;
    public static String ValidZipCA_NotAvailable;
    public static String QuebecState;
    public static String SPC_Config;
    public static String LTLSingleSKU_Baby;
    public static String LTLMultiSKUColor_Baby;
    public static String LTLAccessoriesLeadMultiSKUSizeColor_Baby;
    public static String LTLAccessoriesChildSingleSKU_Baby;
    public static String LTLCollectionChildMultiSKUColorSize_Baby;
    public static String LTLSingleSKU_US;
    public static String LTLMultiSKUColor_US;
    public static String LTLAccessoriesLeadMultiSKUSizeColor_US;
    public static String LTLAccessoriesChildSingleSKU_US;
    public static String LTLCollectionChildMultiSKUColorSize_US;
    public static String MultiSKU_SizeColor_US;
    public static String MultiSKU_SizeColor_Baby;
    public static String MultiSKU_SizeColor_CA;
    public static String MultiSKU_Size_US;
    public static String MultiSKU_Size_Baby;
    public static String MultiSKU_Size_CA;
    public static String ValidStreetName;
    public static String ValidStreetNameCA;
    public static String OtherZip;
    public static String ChallengeQuestion1;
    public static String ChallengeAnswer1;
    public static String ChallengeQuestion2;
    public static String ChallengeAnswer2;
    public static String CouponEmail_CouponWallet;
    public static String LTLSingleSKU_NoDSLOption_US;
    public static String LTLSingleSKU_NoDSLOption_Baby;
    public static String AddressSearchText;
    public static String SecurityCodeAmex;
    public static String Latitude_US_SSWP;
    public static String Longitude_US_SSWP;
    public static String Latitude_US_MSWP;
    public static String Longitude_US_MSWP;
    public static String errorMessageEmailBoxSignIn;
    public static String errorMessagePasswordBoxSignIn;
    public static String Latitude_US_Accessory;
    public static String Longitude_US_Accessory;
    public static String MultiSKUSizeColor_BOPUS_US;
    public static String MultiSKUSizeColor_BOPUS_Baby;
    public static String MultiSKUSizeColor_BOPUS_CA;
    public static String AccessorySSWP_BOPUS_US;
    public static String AccessorySSWP_BOPUS_Baby;
    public static String AccessorySSWP_BOPUS_CA;
    public static String zip_SSWP_US;
    public static String zip_SSWP_Baby;
    public static String zip_SSWP_CA;
    public static String StoreZip_SSWP_US;
    public static String StoreZip_SSWP_Baby;
    public static String StoreZip_SSWP_CA;
    public static String zip_MSWP_US;
    public static String zip_MSWP_Baby;
    public static String zip_MSWP_CA;
    public static String StoreZip_MSWP_US;
    public static String StoreZip_MSWP_Baby;
    public static String StoreZip_MSWP_CA;
    public static String zip_Accessory_US;
    public static String zip_Accessory_Baby;
    public static String zip_Accessory_CA;
    public static String StoreZip_Accessory_US;
    public static String StoreZip_Accessory_Baby;
    public static String StoreZip_Accessory_CA;
    public static String DefaultRadius_US;
    public static String DefaultRadius_Baby;
    public static String DefaultRadius_CA;
    public static String DefaultUpdatedRadius_US;
    public static String DefaultUpdatedRadius_Baby;
    public static String DefaultUpdatedRadius_CA;
    public static String Latitude_Invalid;
    public static String Longitude_Invalid;
    public static String Latitude_CA_SSWP;
    public static String Longitude_CA_SSWP;
    public static String Latitude_CA_MSWP;
    public static String Longitude_CA_MSWP;
    public static String Latitude_CA_Accessory;
    public static String Longitude_CA_Accessory;
    public static String Latitude_Baby_SSWP;
    public static String Longitude_Baby_SSWP;
    public static String Latitude_Baby_MSWP;
    public static String Longitude_Baby_MSWP;
    public static String Latitude_Baby_Accessory;
    public static String Longitude_Baby_Accessory;
    public static String StoresStockNotAvailable_BOPUS_Baby;
    public static String StoresStockNotAvailable_BOPUS_US;
    public static String StoresStockNotAvailable_BOPUS_CA;
    public static String AddressSearchTextCompleteUS;
    public static String AddressSearchTextCompleteCA;
    public static String CountryName_Aruba;
    public static String PilotZipUS;
    public static String NonPilotZip;
    public static String SDDSingleSKU;
    public static String SDDSingleSKUBaby;
    public static String SDDMultiSKU;
    public static String SDDLeadSKU;
    public static String PilotZipBaby;
    public static String InCart_YES_Orig_SS_US;
    public static String InCart_YES_Orig_SS_Baby;
    public static String InCart_YES_Orig_SS_CA;
    public static String InCartLabel;
    public static String InCartDisclaimer2;
    public static String InCartDisclaimer1;
    public static String InCart_YES_Was_MS_US;
    public static String InCart_YES_Was_MS_Baby;
    public static String InCart_YES_Was_MS_CA;
    public static String InCart_No_Null_SS_CA;
    public static String InCart_No_Null_SS_US;
    public static String InCart_No_Null_SS_Baby;
    public static String InCart_YES_Was_LTL_SS_Baby;
    public static String InCart_YES_Was_LTL_SS_CA;
    public static String InCart_YES_Was_LTL_SS_US;
    public static String InCart_YES_Orig_Collection_SS_Baby;
    public static String InCart_YES_Orig_Collection_SS_US;
    public static String InCart_YES_Orig_Collection_SS_CA;
    public static String InCart_Yes_Null_SS_CA;
    public static String InCart_Yes_Null_SS_US;
    public static String InCart_Yes_Null_SS_Baby;
    public static String FISZipCode;
    public static String ValidAddress3;
    public static String ValidCityName3;
    public static String ValidZipUS;
    public static String validStateName1;
    public static String ValidZipBaby;
    public static String ValidCityName4;
    public static String ValidAddress4;
    public static String MyOffers_config;
    public static String WithTwoLetters;
    public static String WithTwoKeywords;
    public static String WithThreeKeywords;
    public static String Thesaurus1;
    public static String Thesaurus2;
    public static String validStateName3;
    public static String WithTwoLetter;
    public static String ValidZipCA2;
    public static String ValidCityNameCA;
    public static String ExtraPaypalPassword;
    public static String ExtraPayPalEmail;
    public static String GiftCardNumber2;
    public static String GiftCardPin2;
    public static String IncorrectGiftCardNumber;
    public static String IncorrectGiftCardErrorMsg;
    public static String url_EndPointURL;
    public static String skuID;
    public static String siteID;
    public static String ipAddress;
    public static String port;
    public static String ProductName;
    public static String RegularProductCASkuId;
    public static String RegularProductBabySkuId;
    public static String RegularProductUSSkuId;
    public static String IncartProductBabySkuId;
    public static String IncartProductCASkuId;
    public static String IncartProductUSSkuId;
    public static String InvalidProductBabySkuId;
    public static String InvalidProductUSSkuId;
    public static String InvalidProductCASkuId;
    public static String url_FEO;
    public static String[] ProductBrandAttributes;
    public static String ProductBrandAttributePath;
    public static String[] ProductSkuAttributes;
    public static String[] ProductSkuAttributesI;
    public static String[] ProductSkuPriceAttributes;
    public static String ProductSkuPriceAttributePath;
    public static String ProductSkuAttributePath;
    public static String ProductSkuAttributePathI;
    public static String[] ProductRootAttributes;
    public static String ProductRootAttributePath;
    public static String[] ProductReviewAttributes;
    public static String ProductReviewAttributePath;
    public static String[] ProductPriceAttributes;
    public static String ProductPriceAttributePath;
    public static String[] ProductIncorrectMappingAttributes;
    public static String[] ProductIncorrectMappingAttributesDB;
    public static String SingleSkuProductUSProductId;
    public static String SingleSkuProductBabyProductId;
    public static String FBTProductUSProductId;
    public static String FBTProductBabyProductId;
    public static String BuyingGuide_baby;
    public static String MultiSkuSizeProductUSProductId;
    public static String MultiSkuSizeProductBabyProductId;
    public static String MultiSkuSizeColorAndSize;
    public static String showMoreLinkProduct;
    public static String showMoreLinkProductBaby;
    public static String multiSkuWithDropdownColorOptions;
    public static String IncartProductUSProductId;
    public static String InvalidProductUSProductId;
    public static String InternationalRestrictedProductUSProductId;
    public static String chalengeQuestionmsgText;
    public static String chalengeQuestionmsgLink;
    public static String registryTypes;
    public static String AddressBookText;
    public static String AddAddressPopupLinkUrl;
    public static String EditAddressPopupLinkUrl;
    public static String RemoveAddressPopupLinkUrl;
    public static String AddressBookLinkUrl;
    public static List<String> expectedCardtype;
    public static List<String> expectedMonths;
    public static List<String> expectedYear;
    public static List<String> expectedErrorMessageonInvalidName;
    public static String AccountURL;
    public static String AccountLeftNavredirectionURL;
    public static String CardHolderName;
    public static String ValidVisaCard;
    public static String ValidAmericanExpress;
    public static String ValidDiscoverCard;
    public static String ValidMasterCard;
    public static String Expected_Error_on_CreditCardpage;
    public static String BillingAddress_CompanyName;
    public static String BlankSpaceFirstName;
    public static String InvalidBillingLastName;
    public static String InvalidBillingCity;
    public static String InvalidBillingZIP;
    public static String InvalidBillingAddress1;
    public static String InvalidFirstNameError;
    public static String InvalidLastNameError;
    public static String InvalidCityNameError;
    public static String InvalidAddressError;
    public static String InvalidZipError;
    public static String InvalidStateError;
    public static String ManageCreditcardpage_URL;
    public static String L2CategoryId;
    public static String L2CustomerRatedFilter;
    public static String RatingAvailableUSProductId;
    public static String RatingAvailableBABYProductId;
    public static String RatingAvailableCAProductId;
    public static String RatingUnavailableProductUSProductId;
    public static String RatingUnavailableProductBABYProductId;
    public static String RatingUnavailableProductCAProductId;
    public static String InvalidRatingProductUSProductId;
    public static String InvalidRatingProductBABYProductId;
    public static String InvalidRatingProductCAProductId;
    public static String RatingAvailableTBSUSProductId;
    public static String RatingAvailableTBSBABYProductId;
    public static String RatingAvailableTBSCAProductId;
    public static String NonIncartProductUSProductId;
    public static String RatingUnavailableProductTBSUSProductId;
    public static String RatingUnavailableProductTBSBABYProductId;
    public static String RatingUnavailableProductTBSCAProductId;
    public static String InvalidRatingProductTBSUSProductId;
    public static String InvalidRatingProductTBSBABYProductId;
    public static String InvalidRatingProductTBSCAProductId;
    public static String InvalidRatingProductBothTBSUSProductId;
    public static String InvalidRatingProductBothTBSBABYProductId;
    public static String InvalidRatingProductBothTBSCAProductId;
    public static String[] ProductReviewCompositeAttributes;
    public static String ProductReviewCompositeAttributePath;
    public static String RegularRelatedCategoryUSProductId;
    public static String[] ProductRelatedCategoryAttributes;
    public static String ProductRelatedCategoryAttributePath;
    public static String[] ProductRelatedCategoryRootAttributes;
    public static String ProductRelatedCategoryRootAttributePath;
    public static String[] ProductRelatedCategoryIncorrectMappingAttributes;
    public static String[] ProductRelatedCategoryIncorrectMappingAttributesDB;
    public static String url_EndPointURLRelatedCategory;
    public static String url_EndPointURLCategoryMS;
    public static String SingleSkuProductUSCategory;
    public static String SingleSkuProductBABYCategory;
    public static String SingleSkuProductCACategory;
    public static String[] ProductCategoryAttributes;
    public static String ProductCategoryAttributePath;
    public static String[] ProductCategorySeoAttributes;
    public static String ProductCategorySeoAttributePath;
    public static String InvalidProductUSCategory;
    public static String FeoStoreId;
    public static String url_EndPointURLStore;
    public static String[] StoreRootAttributes;
    public static String StoreRootAttributePath;
    public static String[] StoreIncorrectMappingAttributes;
    public static String[] StoreIncorrectMappingAttributesDB;
    public static String LoginAPICustomerUserId;
    public static String LoginAPICustomerPassword;
    public static String cardtype;
    public static String cardnumber;
    public static String cardname;
    public static String cardexpmonth;
    public static String cardexpyear;
    public static String[] FetchCreditCardDataAttributes;
    public static String FetchCreditCardDataAttributePath;
    public static String FetchSingleCreditCardDataExpected;
    public static String FetchMultipleCreditCardDataExpected;
    public static String LoginAPICustomerUserIdNone;
    public static String LoginAPICustomerPasswordNone;
    public static String LoginAPICustomerUserIdMultiple;
    public static String LoginAPICustomerPasswordMultiple;
    public static String AddNewCreditCardData;
    public static String ValidCreditCardDataVisa;
    public static String InValidCreditCardDataVisa;
    public static String ValidCreditCardDataAmex;
    public static String InValidCreditCardDataAmex;
    public static String FetchAddNewCreditCarddataExpected;
    public static String[] AddNewCreditCardDataAttributes;
    public static String AddNewCreditCardDataAttributePath;
    public static String ValidCreditCardDataVisaExt;
    public static String ValidCreditCardDataVisaEdit;
    public static String FetchEditedCreditCardDataExpected;
    public static String giftCardBalanceNumberValid;
    public static String giftCardBalancePinValid;
    public static String FeoStoreIds;
    public static String[] StoreRootsAttributes;
    public static String StoreRootsAttributePath;
    public static String url_EndPointURLStoresByList;
    public static String loginUsernameWithChallengeQuestion;
    public static String loginPasswordWithChallengeQuestion;
    public static String FeoStoreIdsCA;
    public static String FeoStoreIdsInvalid;
    public static String url_EndPointURLFooterComponent;
    public static String LoginDrupalCustomerUserId;
    public static String LoginDrupalCustomerPassword;
    public static String[] FetchFooetrComponentAttributes;
    public static String FetchFooetrComponentAttributePath;
    public static String FetchFooetrComponentAttributePathcolumn1;
    public static String FetchFooetrComponentAttributePathcolumn2;
    public static String FetchFooetrComponentAttributePathcolumn3;
    public static String FetchFooetrComponentAttributePathBrands;
    public static String FetchFooetrComponentAttributePathSocial;

    public static String SingleSku_BetheFirstRateAndReview;
    public static String SingleSku_WasPricingProduct;
    public static String SingleSku_ShopAllBrandName;
    public static String SingleSku_VDC;
    public static String SingleSku_WebCollage;
    public static String SingleSku_OOS;
    public static String SingleSku_Accessories;
    public static String L2CategoryIdWithLessThenDefaultValue;
    public static String L1CategoryId;
    public static String FetchFooterComponentDataExpected;
    public static String loginUsernameForResetPassword;
    public static String loginPasswordForResetPassword;
    public static String challengeAnswerFirst;
    public static String challengeAnswerSecond;
    public static String createUserFirstName;
    public static String createUserLastName;
    public static String createUserPhoneNumber;
    public static String createUserMobileNumber;
    public static String createUserFirstChallengeQuestions;
    public static String createUserSecondChallengeQuestions;
    public static String createUserPassword;
    public static String createUserConfirmPassword;
    public static String createUserNumber;
    public static String LoginAPICustomerUserIdToRemove;
    public static String LoginAPICustomerPasswordToRemove;
    public static String buyBuyBabyUserSharedAccountFlagTrueLoginId;
    public static String buyBuyBabyUserSharedAccountFlagTruePasswordId;
    public static String buyBuyBabyUserSharedAccountFlagFalseLoginId;
    public static String buyBuyBabyUserSharedAccountFlagFalsePasswordId;
    public static String bedBathCAUserSharedAccountFlagFalseLoginId;
    public static String bedBathCAUserSharedAccountFlagFalsePasswordId;
    public static String ValidJsonResultString;
    public static String ValidJsonResultStringSDDEligible;
    public static String InvalidJsonResultString;
    public static String InvalidQtyJsonResultString;
    public static String InvalidStoreIdJsonResultString;
    public static String InvalidReserveNowJsonResultString;
    public static String loginUsernameforChangePassword;
    public static String loginPasswordforChangePassword;
    public static String loginNewPasswordforChangePassword;
    public static String insufficientGiftCardBalanceNumber;
    public static String insufficientGiftCardBalancePin;
    public static String catalogReferenceId;
    public static String productReferenceId;
    public static String customerName;
    public static String productName;
    public static String myOffersEmailId;
    public static String myOffersPassword;
    public static String myOffersMobileNumber;
    public static String ValidShippingAddressData;
    public static String InvalidShippingAddressData;
    public static String ValidMultipleShippingMethodData;
    public static String ValidSingleShippingMethodData;
    public static String InvalidShippingMethodData;
    public static String ValidSDDShippingMethodData;
    public static String InvalidSDDShippingMethodData;
    public static String StateCodeValue;
    public static String SecondValidJsonResultString;
    public static String RegistryValidJsonResultString;
    public static String ValidTypeMiniCart;
    public static String InvalidTypeMiniCart;
    public static String CollegeCodeValue;
    public static String url_EndPointURLSKUDetailBySku;
    public static String url_EndPointURLSKUDetailByProduct;
    public static String SkuDetailAPiSKU_Data;
    public static String SkuDetailAPi_Product_Data;
    public static String ValidDynamicContentData;
    public static String InvalidDynamicContentData;
    public static String url_EndPointNew;
    public static String url_EndPointDev;
    public static String ProductDetailAPI_ProductId;
    public static String LoginAPINewCustomerUserId;
    public static String LoginAPINewCustomerPassword;
    public static String UpdateFirstName;
    public static String UpdateLastName;
    public static String UpdateMobileNumber;
    public static String UpdatePhoneNumber;
    public static String LoginUsernameWithNoChallengeQuestion;
    public static String LoginPasswordWithNoChallengeQuestion;
    public static String Env_Header;
    public static String LoginUserNameforConfirmPasswordAPI;
    public static String LoginPasswordforConfirmPasswordAPI;
    public static String LoginAPICustomerUserIdForWishList;
    public static String LoginAPICustomerPasswordForWishList;
    public static String LoginAPICustomerUserIdForAddNewAddress;
    public static String LoginAPICustomerPasswordForAddNewAddress;
    public static String LoginAPICustomerUserIdForEditAddress;
    public static String LoginAPICustomerPasswordForEditAddress;
    public static String LoginAPICustomerUserIdForRemoveAddress;
    public static String LoginAPICustomerPasswordForRemoveAddress;
    public static String UsernameChallengeQuestionsExistence;
    public static String PasswordChallengeQuestionsExistence;
    public static String UsernameForLogoutApi;
    public static String PasswordForLogoutApi;
    public static String UsernameForGetProfileApi;
    public static String PasswordForGetProfileApi;
    public static String UsernameForUpdateProfileApi;
    public static String PasswordForUpdateProfileApi;

    public static String L3CategoryId;
    public static String L2CategoryId_4Pagination;
    public static String L2CategoryId_NoPagination;
    public static String L1CategoryName;
    public static String L2CategoryName;
    public static String L3CategoryName;
    public static String L2CategoryId_BreadCrumps;
    public static String LoginAPICustomerUserIdForPreferredShippingAddress;
    public static String LoginAPICustomerPasswordForPreferredShippingAddress;
    public static String LoginAPICustomerUserIdForPreferredMailingAddress;
    public static String LoginAPICustomerPasswordForPreferredMailingAddress;
    public static String LoginAPICustomerUserIdForPreferredBillingAddress;
    public static String LoginAPICustomerPasswordPreferredBillingAddress;
    public static String ProductWithNoRelatedCategory;
    public static String LoginUsernameData;
    public static String LoginPasswordData;
    public static String CreditcardEditPage_URL;
    public static String ProductWithRelatedCategory;
    public static String url_EndPointURLAtg;
    public static String SFL_Qty;
    public static String TrackOrderValidOrderNo;
    public static String TrackOrderInvalidOrderNo;
    public static String TrackOrderValidEmailAddress;
    public static String TrackOrderInvalidEmailAddress;
    public static String TrackInternationalOrderValidOrderNo;
    public static String TrackInternationalOrderInvalidOrderNo;
    public static String TrackInternationalOrderValidEmailAddress;
    public static String TrackOrderValidUserEmailAddress;
    public static String TrackOrderValidUserPassword;
    public static String TrackOrderInvalidUserPassword;
    public static String ProductIdWithNoSimilarOOSSection;
    public static String MSWPProductWithSimilarOOS;
    public static String giftCardBalanceNumberValidsit;
    public static String giftCardBalancePinValidsit;
    public static String ProductReferenceIdWithCategoryExist_Baby;
    public static String CertonaDataProductId_Baby;
    public static String CertonaDataProductId_US;
    public static String ProductInStock;
    public static String ProductInStockBaby;
    public static String ValidSkuId;
    public static String InValidSkuId;
    public static String locale;
    public static String multiSkuWithSizeDropdown_Baby;
    public static String multiSkuWithSizeDropdown_US;
    public static String MSWPProductInStock;
    public static String cartPageURL;
    public static String atcModalConfig;
    public static String L2CategoryId_DynamicPricing;
    public static String ProductCollection;
    public static String ProductAccessory;
    public static String ProductWithCustomerImage;
    public static String MultiSkuAlternateImage;
    public static String LegacyOrderDetailsofferIDValid;
    public static String LegacyOrderDetailsofferIDInvalid;
    public static String LegacyOrderDetailsUserID;
    public static String LegacyOrderDetailsPassword;
    public static String ValidStoreDataStoreDetailsWithCommerceItems;
    public static String InvalidStoreDataStoreDetailsWithCommerceItems;
    public static String InvalidItemDataStoreDetailsWithCommerceItems;
    public static String CMSAuthorUserName;
    public static String CMSAuthorUserPassword;
    public static String CMSReviewerUserName;
    public static String CMSReviewerUserPassword;
    public static String CMSPublisherUserName;
    public static String CMSPublisherUserPassword;
    public static String CMSContentTitle;
    public static String CMSContentBody;
    public static String CMSContentProducts;
    public static String urlSiteCMSExp;
    public static String CMSComponentNewText;
    public static String CMSComponentEntityType;
    public static String CMSComponentRegion;
    public static String ValidPorchJsonResultString;
    public static String ValidPorchCartPayLoadResultString;
    public static String orderDetailLoggedInUser_EmailId;
    public static String orderDetailLoggedInUser_Password;
    public static String newPassword;
    public static String confirmPassword;
    public static String ValidDynamicContentDataBuying_Guide;
    public static String InvalidDynamicContentDataBuying_Guide;
    public static String resetpasswordemailid;
    public static String SingleSkuEverlivingURL;
    public static String MultiSkuEverlivingURL;
    public static String CollectionSkuEverlivingURL;
    public static String AccessorySkuEverlivingURL;
    public static String ValidLTLJsonResultString;
    public static String ValidBillingAddressData;
    public static String InvalidBillingAddressData;
    public static String url_EndPointDrupalDev;
    public static String url_EndPointDrupalQA;
    public static String url_EndPointDrupalSit;
    public static String[] ExperiencePreviewPDPPageSections;
    public static JSONObject ideaBoardInputJSONString;
    public static String outOfStockSingleSKUUS;
    public static String outOfStockSingleSKUBaby;
    public static String outOfStockMultiSKUUS;
    public static String NormalKeyword;
    public static String RelatedSearchKeyword;
    public static String AutoCorrectSearchKeyword;
    public static String DidYouMeanSearchKeyword;
    public static String ZeroResultSearchKeyword;
    public static String WithoutPaginationResultSearchKeyword;
    public static String ThreeCharacterSearchKeyword;
    public static String SpaceCharacterSearchKeyword;
    public static String SpecialCharacterSearchKeyword;
    public static String CollectionProductUSProductId;
    public static String AccessoryProductUSProductId;
    public static String cLPPageURL;
    public static String CertonaSingleSKU;
    public static String CertonaMultiSku;
    public static String CertonaCollection;
    public static String CertonaAccessory;
    public static String GiftCardNumber2Baby;
    public static String GiftCardPin2Baby;
    public static String ProductCollectionbaby;
    public static String ProductAccessoryBaby;
    public static String ProductWithCustomerImageBaby;
    public static String UserContactEmailid;
    public static String UserContactPhoneNumber;
    public static String FeaturesSpecsSKUData_US;
    public static String FeaturesSpecsSKUData_Baby;
    public static String FeaturesSpecsMSKUData_US;
    public static String FeaturesSpecsMSKUData_Baby;

    public static String LTLUS;
    public static String LTLBaby;
    public static String LTLMultiSkuUS;
    public static String LTLMultiSkuBaby;
    public static String JSON_GiftMessageInputPayload;
    public static String JSON_MissinggiftWrapMessage;
    public static String JSON_MissingcontainsGiftWrap;
    public static String JSON_MissingContainsGiftWrapMessage;
    public static String[] ExperiencePreviewPDPPageSectionsEverlivingSKU;
    public static String[] ExperiencePreviewPDPPageSectionsEverlivingGroup;
    public static String ValidAddMultipleShippingToOrderData;
    public static String InvalidAddMultipleShippingToOrderData;
    public static String ValidCreditCardBillingAddressData;
    public static String InvalidCreditCardBillingAddressData;

    public static String CoRegFirstName;
    public static String CoRegLastName;
    public static String EventDate;
    public static String NumberofGuest;
    public static String NewUserpassword;
    public static String cacheassemblerUrl;
    public static String DrupalUrl;
    public static String SOLRUrl;
    public static String enhanceStoreValidJosn;
    public static String enhanceStoreInvalidJosn;
    public static String AcessoryLeadLTL;
    public static String AcessoryChildLTL;
    public static String Katori_PY;
    public static String Katori_PY_Baby;
    public static String EnterCutomizedText;
    public static String Katori_PB;
    public static String Katori_PB_Baby;
    public static String Katori_CR;
    public static String Katori_CR_Baby;
    public static String ProductDetailAPI_ProductIdBaby;
    public static String SkuDetailAPiSKU_DataBaby;
    public static String SkuDetailAPi_Product_DataBaby;
    public static String APIVersionUrl;
    public static String APIVersion_Flag;
    public static String ApplicationURL;
    public static String APIPaypalloginEmail;
    public static String APIPaypalloginPassword;
    public static String APIPaypalloginInternationlEmail;
    public static String APIPaypalloginInternationlPassword;
    public static String Bopus_SingleSKU;
    public static String BopusZipCodeUS;
    public static String RegistryUserEmailPassword;
    public static String RegistryUserEmail;
    public static String MultiSkuWithDropdownColorOptions_Baby;
    public static String Accessories_with_Child_LTL_Baby;
    public static String Accessories_with_Lead_LTL_Baby;
    public static String Multi_Sku_Color_Size_Baby;
    public static String KingBeddingKeyword;
    public static String ValidBopusJsonResultString;
    public static String outOfStockMultiSKUBaby;
    public static String Env_Flag;
    public static String prod_queryParam;
    public static String SDD_SingleSKU;
    public static String CoRegEmailid;

    public static void getTestData() throws Throwable {

	System.out.println("Fetching test data...");

	JSONObject jsonObject = DataMgr.getJSONDataURL("TestData.json");

	JSONObject jsonObjectArray = DataMgr
		.fetchDataJsonArrayObject("productdata", "MultiSKU_Size_CA",
			"prod_Type", "TestData.json");

	MultiSKU_Size_CA = (String) jsonObjectArray.get("ProductIDOrName");
	Expected_Error_on_CreditCardpage = (String) jsonObject
		.get("Expected_Error_on_CreditCardpage");
	ValidAmericanExpress = (String) jsonObject.get("ValidAmericanExpress");
	ValidDiscoverCard = (String) jsonObject.get("ValidDiscoverCard");
	ValidMasterCard = (String) jsonObject.get("ValidMasterCard");
	newPassword = (String) jsonObject.get("newPassword");
	confirmPassword = (String) jsonObject.get("confirmPassword");

	ideaBoardInputJSONString = DataMgr.fetchDataJsonArrayObjectFormFields(
		"ideaBoardInputJSONString", "TestData.json");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ViewMoreLinkProductTab_Baby", "prod_Type", "TestData.json");

	ViewMoreLinkProductTab_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ViewMoreLinkProductTab_CA", "prod_Type", "TestData.json");

	ViewMoreLinkProductTab_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ViewMoreLinkProductTab_US", "prod_Type", "TestData.json");

	ViewMoreLinkProductTab_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Was_SS_US", "prod_Type", "TestData.json");

	InCart_YES_Was_SS_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Was_SS_CA", "prod_Type", "TestData.json");

	InCart_YES_Was_SS_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Was_SS_Baby", "prod_Type", "TestData.json");

	InCart_YES_Was_SS_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_No_Was_SS_Baby", "prod_Type", "TestData.json");

	InCart_No_Was_SS_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	SpecialCharFirstName = (String) jsonObject.get("SpecialCharFirstName");

	BlankSpaceFirstName = (String) jsonObjectArray
		.get("BlankSpaceFirstName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_No_Was_SS_CA", "prod_Type", "TestData.json");

	InCart_No_Was_SS_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_No_Was_SS_US", "prod_Type", "TestData.json");

	InCart_No_Was_SS_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_Yes_Null_SS_Baby", "prod_Type", "TestData.json");

	InCart_Yes_Null_SS_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_Yes_Null_SS_CA", "prod_Type", "TestData.json");

	InCart_Yes_Null_SS_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_Yes_Null_SS_US", "prod_Type", "TestData.json");

	InCart_Yes_Null_SS_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Was_EximPB_MS_US", "prod_Type", "TestData.json");

	InCart_YES_Was_EximPB_MS_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Was_EximPB_MS_CA", "prod_Type", "TestData.json");

	InCart_YES_Was_EximPB_MS_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Was_EximPB_MS_Baby", "prod_Type", "TestData.json");

	InCart_YES_Was_EximPB_MS_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Orig_EximPY_MS_US", "prod_Type", "TestData.json");

	InCart_YES_Orig_EximPY_MS_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Orig_EximPY_MS_CA", "prod_Type", "TestData.json");

	InCart_YES_Orig_EximPY_MS_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Orig_EximPY_MS_Baby", "prod_Type", "TestData.json");

	InCart_YES_Orig_EximPY_MS_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Orig_Collection_SS_CA", "prod_Type",
		"TestData.json");

	InCart_YES_Orig_Collection_SS_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Orig_Collection_SS_US", "prod_Type",
		"TestData.json");

	InCart_YES_Orig_Collection_SS_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Orig_Collection_SS_Baby", "prod_Type",
		"TestData.json");

	InCart_YES_Orig_Collection_SS_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Was_LTL_SS_US", "prod_Type", "TestData.json");

	InCart_YES_Was_LTL_SS_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Was_LTL_SS_CA", "prod_Type", "TestData.json");

	InCart_YES_Was_LTL_SS_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Was_LTL_SS_Baby", "prod_Type", "TestData.json");

	InCart_YES_Was_LTL_SS_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_No_Null_SS_US", "prod_Type", "TestData.json");

	InCart_No_Null_SS_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_No_Null_SS_CA", "prod_Type", "TestData.json");

	InCart_No_Null_SS_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_No_Null_SS_Baby", "prod_Type", "TestData.json");

	InCart_No_Null_SS_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Was_MS_US", "prod_Type", "TestData.json");

	InCart_YES_Was_MS_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Was_MS_Baby", "prod_Type", "TestData.json");

	InCart_YES_Was_MS_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Was_MS_CA", "prod_Type", "TestData.json");

	InCart_YES_Was_MS_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Orig_SS_US", "prod_Type", "TestData.json");

	InCart_YES_Orig_SS_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Orig_SS_CA", "prod_Type", "TestData.json");

	InCart_YES_Orig_SS_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InCart_YES_Orig_SS_Baby", "prod_Type", "TestData.json");

	InCart_YES_Orig_SS_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"StoresStockNotAvailable_BOPUS_CA", "prod_Type",
		"TestData.json");

	StoresStockNotAvailable_BOPUS_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"StoresStockNotAvailable_BOPUS_US", "prod_Type",
		"TestData.json");

	StoresStockNotAvailable_BOPUS_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"StoresStockNotAvailable_BOPUS_Baby", "prod_Type",
		"TestData.json");

	StoresStockNotAvailable_BOPUS_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKUSizeColor_BOPUS_US", "prod_Type", "TestData.json");

	MultiSKUSizeColor_BOPUS_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKUSizeColor_BOPUS_Baby", "prod_Type", "TestData.json");

	MultiSKUSizeColor_BOPUS_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKUSizeColor_BOPUS_CA", "prod_Type", "TestData.json");

	MultiSKUSizeColor_BOPUS_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"AccessorySSWP_BOPUS_US", "prod_Type", "TestData.json");

	AccessorySSWP_BOPUS_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"AccessorySSWP_BOPUS_Baby", "prod_Type", "TestData.json");

	AccessorySSWP_BOPUS_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"AccessoryMultiSKURangeAboveAndBelow49_US", "prod_Type",
		"TestData.json");

	AccessoryMultiSKURangeAboveAndBelow49_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"AccessorySingleSKUAbove49_US", "prod_Type", "TestData.json");

	AccessorySingleSKUAbove49_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LTLSingleSKUAbove49_US", "prod_Type", "TestData.json");

	LTLSingleSKUAbove49_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LTLSingleSKUAbove49_Baby", "prod_Type", "TestData.json");

	LTLSingleSKUAbove49_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"CollectionProductRangeBelow49_US", "prod_Type",
		"TestData.json");

	CollectionProductRangeBelow49_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"CollectionProductRangeAboveAndBelow49_US", "prod_Type",
		"TestData.json");

	CollectionProductRangeAboveAndBelow49_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"SingleSKUAbove49_US", "prod_Type", "TestData.json");

	SingleSKUAbove49_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr
		.fetchDataJsonArrayObject("productdata",
			"MultiSKURangeAboveAndBelow49_US", "prod_Type",
			"TestData.json");

	MultiSKURangeAboveAndBelow49_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"AccessoryMultiSKURangeAboveAndBelow49_CA", "prod_Type",
		"TestData.json");

	AccessoryMultiSKURangeAboveAndBelow49_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"AccessorySingleSKUAbove49_CA", "prod_Type", "TestData.json");

	AccessorySingleSKUAbove49_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"CollectionProductRangeBelow49_CA", "prod_Type",
		"TestData.json");

	CollectionProductRangeBelow49_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"CollectionProductRangeAboveAndBelow49_CA", "prod_Type",
		"TestData.json");

	CollectionProductRangeAboveAndBelow49_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"SingleSKUAbove49_CA", "prod_Type", "TestData.json");

	SingleSKUAbove49_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr
		.fetchDataJsonArrayObject("productdata",
			"MultiSKURangeAboveAndBelow49_CA", "prod_Type",
			"TestData.json");

	MultiSKURangeAboveAndBelow49_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"AccessoryMultiSKURangeAboveAndBelow49_Baby", "prod_Type",
		"TestData.json");

	AccessoryMultiSKURangeAboveAndBelow49_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"AccessorySingleSKUAbove49_Baby", "prod_Type", "TestData.json");

	AccessorySingleSKUAbove49_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"CollectionProductRangeBelow49_Baby", "prod_Type",
		"TestData.json");

	CollectionProductRangeBelow49_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"CollectionProductRangeAboveAndBelow49_Baby", "prod_Type",
		"TestData.json");

	CollectionProductRangeAboveAndBelow49_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"SingleSKUAbove49_Baby", "prod_Type", "TestData.json");

	SingleSKUAbove49_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKURangeAboveAndBelow49_Baby", "prod_Type",
		"TestData.json");

	MultiSKURangeAboveAndBelow49_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"AccessorySSWP_BOPUS_CA", "prod_Type", "TestData.json");

	AccessorySSWP_BOPUS_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKU_Size_Baby", "prod_Type", "TestData.json");

	MultiSKU_Size_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKU_Size_US", "prod_Type", "TestData.json");

	MultiSKU_Size_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKU_SizeColor_CA", "prod_Type", "TestData.json");

	MultiSKU_SizeColor_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKU_SizeColor_Baby", "prod_Type", "TestData.json");

	MultiSKU_SizeColor_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKU_SizeColor_US", "prod_Type", "TestData.json");

	MultiSKU_SizeColor_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LTLSingleSKU_Baby", "prod_Type", "TestData.json");

	LTLSingleSKU_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LTLSingleSKU_US", "prod_Type", "TestData.json");

	LTLSingleSKU_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LTLMultiSKUColor_Baby", "prod_Type", "TestData.json");

	LTLMultiSKUColor_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKUColorAndSize_CA", "prod_Type", "TestData.json");

	MultiSKUColorAndSize_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKUColorAndSize_Baby", "prod_Type", "TestData.json");

	MultiSKUColorAndSize_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKUColorAndSize_US", "prod_Type", "TestData.json");

	MultiSKUColorAndSize_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LTLMultiSKUColor_US", "prod_Type", "TestData.json");

	LTLMultiSKUColor_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LTLAccessoriesLeadMultiSKUSizeColor_Baby", "prod_Type",
		"TestData.json");

	LTLAccessoriesLeadMultiSKUSizeColor_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LTLAccessoriesLeadMultiSKUSizeColor_US", "prod_Type",
		"TestData.json");

	LTLAccessoriesLeadMultiSKUSizeColor_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr
		.fetchDataJsonArrayObject("productdata",
			"LTLAccessoriesChildSingleSKU_US", "prod_Type",
			"TestData.json");

	LTLAccessoriesChildSingleSKU_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LTLAccessoriesChildSingleSKU_Baby", "prod_Type",
		"TestData.json");

	LTLAccessoriesChildSingleSKU_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LTLSingleSKU_NoDSLOption_US", "prod_Type", "TestData.json");

	LTLSingleSKU_NoDSLOption_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LTLSingleSKU_NoDSLOption_Baby", "prod_Type", "TestData.json");

	LTLSingleSKU_NoDSLOption_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LTLCollectionChildMultiSKUColorSize_Baby", "prod_Type",
		"TestData.json");

	LTLCollectionChildMultiSKUColorSize_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LTLCollectionChildMultiSKUColorSize_US", "prod_Type",
		"TestData.json");

	LTLCollectionChildMultiSKUColorSize_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LowStockQuantity1_BOPUS_US", "prod_Type", "TestData.json");

	LowStockQuantity1_BOPUS_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LowStockQuantity1_BOPUS_Baby", "prod_Type", "TestData.json");

	LowStockQuantity1_BOPUS_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LowStockQuantity1_BOPUS_CA", "prod_Type", "TestData.json");

	LowStockQuantity1_BOPUS_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"OutOfStock_BOPUS_US", "prod_Type", "TestData.json");

	OutOfStock_BOPUS_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"OutOfStock_BOPUS_Baby", "prod_Type", "TestData.json");

	OutOfStock_BOPUS_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"OutOfStock_BOPUS_CA", "prod_Type", "TestData.json");

	OutOfStock_BOPUS_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"NotReserveOnline_BOPUS_US", "prod_Type", "TestData.json");

	NotReserveOnline_BOPUS_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"NotReserveOnline_BOPUS_Baby", "prod_Type", "TestData.json");

	NotReserveOnline_BOPUS_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"NotReserveOnline_BOPUS_CA", "prod_Type", "TestData.json");

	NotReserveOnline_BOPUS_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ItemColorSwatch_US", "prod_Type", "TestData.json");

	ItemColorSwatch_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ItemColorSwatch_Baby", "prod_Type", "TestData.json");

	ItemColorSwatch_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ItemColorSwatch_CA", "prod_Type", "TestData.json");

	ItemColorSwatch_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"AccessoryChildItemHavingColorSwatches_US", "prod_Type",
		"TestData.json");

	AccessoryChildItemHavingColorSwatches_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"AccessoryChildItemHavingColorSwatches_Baby", "prod_Type",
		"TestData.json");

	AccessoryChildItemHavingColorSwatches_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"AccessoryChildItemHavingColorSwatches_CA", "prod_Type",
		"TestData.json");

	AccessoryChildItemHavingColorSwatches_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"CollectionItemHavingSwatchesMoreThan11WithSizeDropDown_US",
		"prod_Type", "TestData.json");

	CollectionItemHavingSwatchesMoreThan11WithSizeDropDown_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"CollectionItemHavingSwatchesMoreThan11WithSizeDropDown_Baby",
		"prod_Type", "TestData.json");

	CollectionItemHavingSwatchesMoreThan11WithSizeDropDown_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"CollectionItemHavingSwatchesMoreThan11WithSizeDropDown_CA",
		"prod_Type", "TestData.json");

	CollectionItemHavingSwatchesMoreThan11WithSizeDropDown_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ItemHavingFinishSwatches_US", "prod_Type", "TestData.json");

	ItemHavingFinishSwatches_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ItemHavingFinishSwatches_Baby", "prod_Type", "TestData.json");

	ItemHavingFinishSwatches_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ItemHavingFinishSwatches_CA", "prod_Type", "TestData.json");

	ItemHavingFinishSwatches_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"PartialSearchKeywordHavingSwatches_Baby", "prod_Type",
		"TestData.json");

	PartialSearchKeywordHavingSwatches_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"PartialSearchKeywordHavingSwatches_CA", "prod_Type",
		"TestData.json");

	PartialSearchKeywordHavingSwatches_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"PartialSearchKeywordHavingSwatches_US", "prod_Type",
		"TestData.json");

	PartialSearchKeywordHavingSwatches_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ItemHavingSwatchesLessThan5_Baby", "prod_Type",
		"TestData.json");

	ItemHavingSwatchesLessThan5_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ItemHavingSwatchesLessThan5_CA", "prod_Type", "TestData.json");

	ItemHavingSwatchesLessThan5_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"VDC_CA", "prod_Type", "TestData.json");

	VDC_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ItemHavingSwatchesLessThan5_US", "prod_Type", "TestData.json");

	ItemHavingSwatchesLessThan5_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr
		.fetchDataJsonArrayObject("productdata",
			"ItemHavingSwatchesEqualTo7_Baby", "prod_Type",
			"TestData.json");

	ItemHavingSwatchesEqualTo7_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ItemHavingSwatchesEqualTo7_CA", "prod_Type", "TestData.json");

	ItemHavingSwatchesEqualTo7_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ItemHavingSwatchesEqualTo7_US", "prod_Type", "TestData.json");

	ItemHavingSwatchesEqualTo7_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr
		.fetchDataJsonArrayObject("productdata",
			"ItemHavingSwatchesEqualTo5_Baby", "prod_Type",
			"TestData.json");

	ItemHavingSwatchesEqualTo5_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ItemHavingSwatchesEqualTo5_CA", "prod_Type", "TestData.json");

	ItemHavingSwatchesEqualTo5_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ItemHavingSwatchesEqualTo5_US", "prod_Type", "TestData.json");

	ItemHavingSwatchesEqualTo5_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MappedChecklist", "prod_Type", "TestData.json");
	MappedChecklist = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ItemHavingSwatchesMoreThan7_Baby", "prod_Type",
		"TestData.json");

	ItemHavingSwatchesMoreThan7_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ItemHavingSwatchesMoreThan7_CA", "prod_Type", "TestData.json");

	ItemHavingSwatchesMoreThan7_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ItemHavingSwatchesMoreThan7_US", "prod_Type", "TestData.json");

	ItemHavingSwatchesMoreThan7_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"VDC_ShipThisOOS", "prod_Type", "TestData.json");

	VDC_ShipThisOOS_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"VDC_ShipThisOOS_Baby", "prod_Type", "TestData.json");

	VDC_ShipThisOOS_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"VDC_ShipThisOOS_CA", "prod_Type", "TestData.json");

	VDC_ShipThisOOS_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"BOPUS_ShipThisOOS", "prod_Type", "TestData.json");

	BOPUS_ShipThisOOS_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"BOPUS_ShipThisOOS_Baby", "prod_Type", "TestData.json");

	BOPUS_ShipThisOOS_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"BOPUS_ShipThisOOS_CA", "prod_Type", "TestData.json");

	BOPUS_ShipThisOOS_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL8_CA", "prod_Type", "TestData.json");

	RegularSFL8_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL8_Baby", "prod_Type", "TestData.json");

	RegularSFL8_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL8", "prod_Type", "TestData.json");

	RegularSFL8_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL9_CA", "prod_Type", "TestData.json");

	RegularSFL9_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"WriteAReview_US", "prod_Type", "TestData.json");

	WriteAReview_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"WriteAReview_Baby", "prod_Type", "TestData.json");

	WriteAReview_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"WriteAReview_CA", "prod_Type", "TestData.json");

	WriteAReview_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL9_Baby", "prod_Type", "TestData.json");

	RegularSFL9_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL9", "prod_Type", "TestData.json");

	RegularSFL9_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL7_CA", "prod_Type", "TestData.json");

	RegularSFL7_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL7_Baby", "prod_Type", "TestData.json");

	RegularSFL7_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL7", "prod_Type", "TestData.json");

	RegularSFL7_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL6_CA", "prod_Type", "TestData.json");

	RegularSFL6_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL6_Baby", "prod_Type", "TestData.json");

	RegularSFL6_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL6", "prod_Type", "TestData.json");

	RegularSFL6_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL5_CA", "prod_Type", "TestData.json");

	RegularSFL5_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL5_Baby", "prod_Type", "TestData.json");

	RegularSFL5_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL5", "prod_Type", "TestData.json");

	RegularSFL5_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL4_CA", "prod_Type", "TestData.json");

	RegularSFL4_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL4_Baby", "prod_Type", "TestData.json");

	RegularSFL4_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL4", "prod_Type", "TestData.json");

	RegularSFL4_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL3_CA", "prod_Type", "TestData.json");

	RegularSFL3_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL3_Baby", "prod_Type", "TestData.json");

	RegularSFL3_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL3", "prod_Type", "TestData.json");

	RegularSFL3_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL2_CA", "prod_Type", "TestData.json");

	RegularSFL2_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL2_Baby", "prod_Type", "TestData.json");

	RegularSFL2_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL2", "prod_Type", "TestData.json");

	RegularSFL2_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL1_CA", "prod_Type", "TestData.json");

	RegularSFL1_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL1_Baby", "prod_Type", "TestData.json");

	RegularSFL1_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL1", "prod_Type", "TestData.json");

	RegularSFL1_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"RegularSFL8_CA", "prod_Type", "TestData.json");

	RegularSFL8_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKU_QuickView", "prod_Type", "TestData.json");

	MultiSKU_QuickView_US = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKU_QuickView_BabyNonInternationalRestricted",
		"prod_Type", "TestData.json");

	MultiSKU_QuickView_BabyNonInternationalRestricted = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKU_QuickView_Baby", "prod_Type", "TestData.json");

	MultiSKU_QuickView_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKU_QuickView_CA", "prod_Type", "TestData.json");

	MultiSKU_QuickView_CA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_CollectionMultiSKU_CR", "prod_Type",
		"TestData.json");

	Personalized_CollectionMultiSKU_CR_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_CollectionMultiSKU_CR_Baby", "prod_Type",
		"TestData.json");

	Personalized_CollectionMultiSKU_CR_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_CollectionMultiSKU_CR_CA", "prod_Type",
		"TestData.json");

	Personalized_CollectionMultiSKU_CR_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_AccessoryChildSingleSKU_PB", "prod_Type",
		"TestData.json");

	Personalized_AccessoryChildSingleSKU_PB_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_AccessoryChildSingleSKU_PB_Baby", "prod_Type",
		"TestData.json");

	Personalized_AccessoryChildSingleSKU_PB_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_AccessoryChildSingleSKU_PB_CA", "prod_Type",
		"TestData.json");

	Personalized_AccessoryChildSingleSKU_PB_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_AccessoryLeadMultiSKU_CR", "prod_Type",
		"TestData.json");

	Personalized_AccessoryLeadMultiSKU_CR_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_AccessoryLeadMultiSKU_CR_Baby", "prod_Type",
		"TestData.json");

	Personalized_AccessoryLeadMultiSKU_CR_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_AccessoryLeadMultiSKU_CR_CA", "prod_Type",
		"TestData.json");

	Personalized_AccessoryLeadMultiSKU_CR_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_MultiSKU_PY", "prod_Type", "TestData.json");

	Personalized_MultiSKU_PY_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_MultiSKU_PY_Baby", "prod_Type", "TestData.json");

	Personalized_MultiSKU_PY_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_MultiSKU_PY_CA", "prod_Type", "TestData.json");

	Personalized_MultiSKU_PY_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_SingleSKU_PB", "prod_Type", "TestData.json");

	Personalized_SingleSKU_PB_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_SingleSKU_PY", "prod_Type", "TestData.json");

	Personalized_SingleSKU_PY_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_SingleSKU_PY_Baby", "prod_Type", "TestData.json");

	Personalized_SingleSKU_PY_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_SingleSKU_PY_CA", "prod_Type", "TestData.json");

	Personalized_SingleSKU_PY_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_SingleSKU_CR", "prod_Type", "TestData.json");

	Personalized_SingleSKU_CR_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_SingleSKU_CR_Baby", "prod_Type", "TestData.json");

	Personalized_SingleSKU_CR_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_SingleSKU_CR_CA", "prod_Type", "TestData.json");

	Personalized_SingleSKU_CR_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_SingleSKU_PB_Baby", "prod_Type", "TestData.json");

	Personalized_SingleSKU_PB_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Personalized_SingleSKU_PB_CA", "prod_Type", "TestData.json");

	Personalized_SingleSKU_PB_CA = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"valid_prod", "prod_Type", "TestData.json");

	ValidProductId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"valid_prod_Baby", "prod_Type", "TestData.json");
	ValidProductBabyId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"valid_prod_CA", "prod_Type", "TestData.json");
	ValidProductCAId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"invalid_prod", "prod_Type", "TestData.json");
	InvalidProductId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Regular", "prod_Type", "TestData.json");
	RegularProductId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Regular_Baby", "prod_Type", "TestData.json");
	RegularProductBabyId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Regular_CA", "prod_Type", "TestData.json");
	RegularProductCAId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"BOPUS", "prod_Type", "TestData.json");
	BOPUSProductId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"BOPUS_Baby", "prod_Type", "TestData.json");
	BOPUSProductBabyId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"BOPUS_CA", "prod_Type", "TestData.json");
	BOPUSProductCAId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Accessory", "prod_Type", "TestData.json");
	AccessoryProductId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Accessory_Baby", "prod_Type", "TestData.json");
	AccessoryProductBabyId = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Accessory_CA", "prod_Type", "TestData.json");
	AccessoryProductCAId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LTL_Product", "prod_Type", "TestData.json");
	LTLProductId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"LTL_Product_Baby", "prod_Type", "TestData.json");
	LTLProductBabyId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Collection", "prod_Type", "TestData.json");
	CollectionProductId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Collection_Baby", "prod_Type", "TestData.json");
	CollectionProductBabyId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Collection_CA", "prod_Type", "TestData.json");
	CollectionProductCAId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKU", "prod_Type", "TestData.json");
	MultiSKUProductId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Keyword", "prod_Type", "TestData.json");
	ProductKeyword = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Keyword_Baby", "prod_Type", "TestData.json");
	ProductKeywordBaby = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Keyword_CA", "prod_Type", "TestData.json");
	ProductKeywordCA = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKU_Baby", "prod_Type", "TestData.json");
	MultiSKUBabyId = (String) jsonObjectArray.get("ProductIDOrName");
	// ToDo Check for existance of this product
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Registry_Baby", "prod_Type", "TestData.json");
	RegistryBaby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Registry_CA", "prod_Type", "TestData.json");
	RegistryCA = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"MultiSKU_CA", "prod_Type", "TestData.json");
	MultiSKUCAId = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"BopusDisabled", "prod_Type", "TestData.json");
	BopusDisabled = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"BopusDisabled_Baby", "prod_Type", "TestData.json");
	BopusDisabledBabyId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"BopusDisabled_CA", "prod_Type", "TestData.json");
	BopusDisabledCAId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Thesaurus2", "prod_Type", "TestData.json");
	Thesaurus2 = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Thesaurus1", "prod_Type", "TestData.json");
	Thesaurus1 = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"First", "CardSelector", "TestData.json");
	FirstCardType = (String) jsonObjectArray.get("CardType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"First", "CardSelector", "TestData.json");
	FirstCardNumber = (String) jsonObjectArray.get("CardNumber");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"First", "CardSelector", "TestData.json");
	FirstCardSecurityCode = (String) jsonObjectArray.get("SecurityCode");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"Second", "CardSelector", "TestData.json");
	SecondCardType = (String) jsonObjectArray.get("CardType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"Second", "CardSelector", "TestData.json");
	SecondCardNumber = (String) jsonObjectArray.get("CardNumber");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"Second", "CardSelector", "TestData.json");
	SecondCardSecurityCode = (String) jsonObjectArray.get("SecurityCode");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBV", "CardSelector", "TestData.json");
	VBVCardType = (String) jsonObjectArray.get("CardType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBV", "CardSelector", "TestData.json");
	VBVCardNumber = (String) jsonObjectArray.get("CardNumber");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBV", "CardSelector", "TestData.json");
	VBVCardSecurityCode = (String) jsonObjectArray.get("SecurityCode");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVAuthFail", "CardSelector", "TestData.json");
	VBVAuthFailCardType = (String) jsonObjectArray.get("CardType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVAuthFail", "CardSelector", "TestData.json");
	VBVAuthFailCardNumber = (String) jsonObjectArray.get("CardNumber");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVAuthFail", "CardSelector", "TestData.json");
	VBVAuthFailCardSecurityCode = (String) jsonObjectArray
		.get("SecurityCode");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVCyberAuth-U-Fail", "CardSelector", "TestData.json");
	VBVCyberAuthUFailCardType = (String) jsonObjectArray.get("CardType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVCyberAuth-U-Fail", "CardSelector", "TestData.json");
	VBVCyberAuthUFailCardNumber = (String) jsonObjectArray
		.get("CardNumber");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVCyberAuth-U-Fail", "CardSelector", "TestData.json");
	VBVCyberAuthUFailCardSecurityCode = (String) jsonObjectArray
		.get("SecurityCode");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVAuthTimeout", "CardSelector", "TestData.json");
	VBVAuthTimeoutCardType = (String) jsonObjectArray.get("CardType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVAuthTimeout", "CardSelector", "TestData.json");
	VBVAuthTimeoutCardNumber = (String) jsonObjectArray.get("CardNumber");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVAuthTimeout", "CardSelector", "TestData.json");
	VBVAuthTimeoutCardSecurityCode = (String) jsonObjectArray
		.get("SecurityCode");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVLookupTimeout", "CardSelector", "TestData.json");
	VBVLookupTimeoutCardType = (String) jsonObjectArray.get("CardType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVLookupTimeout", "CardSelector", "TestData.json");
	VBVLookupTimeoutCardNumber = (String) jsonObjectArray.get("CardNumber");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVLookupTimeout", "CardSelector", "TestData.json");
	VBVLookupTimeoutCardSecurityCode = (String) jsonObjectArray
		.get("SecurityCode");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVSign-A-Fail", "CardSelector", "TestData.json");
	VBVSignAFailCardType = (String) jsonObjectArray.get("CardType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVSign-A-Fail", "CardSelector", "TestData.json");
	VBVSignAFailCardNumber = (String) jsonObjectArray.get("CardNumber");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVSign-A-Fail", "CardSelector", "TestData.json");
	VBVSignAFailCardSecurityCode = (String) jsonObjectArray
		.get("SecurityCode");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVSign-U-Fail", "CardSelector", "TestData.json");
	VBVSignUFailCardType = (String) jsonObjectArray.get("CardType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVSign-U-Fail", "CardSelector", "TestData.json");
	VBVSignUFailCardNumber = (String) jsonObjectArray.get("CardNumber");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVSign-U-Fail", "CardSelector", "TestData.json");
	VBVSignUFailCardSecurityCode = (String) jsonObjectArray
		.get("SecurityCode");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVSignAuthFail", "CardSelector", "TestData.json");
	VBVSignAuthFailCardType = (String) jsonObjectArray.get("CardType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVSignAuthFail", "CardSelector", "TestData.json");
	VBVSignAuthFailCardNumber = (String) jsonObjectArray.get("CardNumber");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVSignAuthFail", "CardSelector", "TestData.json");
	VBVSignAuthFailCardSecurityCode = (String) jsonObjectArray
		.get("SecurityCode");

	url_EndPointURLPrice = System.getProperty("apiUrl",
		(String) jsonObject.get("url_EndPointURLPrice"));
	url_EndPointURL = System.getProperty("apiUrl",
		(String) jsonObject.get("url_EndPointURL"));
	url_EndPointURLInventory = System.getProperty("apiUrl",
		(String) jsonObject.get("url_EndPointURLInventory"));
	url_EndPointURLReview = System.getProperty("apiUrl",
		(String) jsonObject.get("url_EndPointURLReview"));
	url_EndPointURLRelatedCategory = System.getProperty("apiUrl",
		(String) jsonObject.get("url_EndPointURLRelatedCategory"));
	url_EndPointURLCategoryMS = System.getProperty("apiUrl",
		(String) jsonObject.get("url_EndPointURLCategoryMS"));
	url_EndPointURLStore = System.getProperty("apiUrl",
		(String) jsonObject.get("url_EndPointURLStore"));
	url_EndPointURLCreditCard = System.getProperty("apiUrl",
		(String) jsonObject.get("url_EndPointURLCreditCard"));
	url_EndPointURLSession = System.getProperty("apiUrl",
		(String) jsonObject.get("url_EndPointURLSession"));
	url_EndPointURLLogin = System.getProperty("apiUrl",
		(String) jsonObject.get("url_EndPointURLLogin"));
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOgetCompositeServicedata", "ProductVariantOptions",
		"attribute_category", "TestData.json");
	ProductVariantOptionsAttributes = jsonObjectArray
		.get("attributues_name").toString().replaceAll("^.|.$", "")
		.replace("\"", "").split(",");
	ProductVariantOptionsAttributePath = (String) jsonObjectArray
		.get("attribute_path");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOInCorrectDataMappingCommon", "IncorrectMappingCommon",
		"attriute_type", "TestData.json");
	ProductIncorrectMappingCommonAttributes = jsonObjectArray
		.get("Attribute_Name").toString().replaceAll("^.|.$", "")
		.replace("\"", "").split(",");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVRefreshFail", "CardSelector", "TestData.json");
	VBVRefreshFailCardType = (String) jsonObjectArray.get("CardType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVRefreshFail", "CardSelector", "TestData.json");
	VBVRefreshFailCardNumber = (String) jsonObjectArray.get("CardNumber");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("creditcarddata",
		"VBVRefreshFail", "CardSelector", "TestData.json");
	VBVRefreshFailCardSecurityCode = (String) jsonObjectArray
		.get("SecurityCode");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Second_BOPUS_Baby", "prod_Type", "TestData.json");

	Second_BOPUS_Baby = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Second_BOPUS_CA", "prod_Type", "TestData.json");

	Second_BOPUS_CA = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Second_BOPUS", "prod_Type", "TestData.json");

	Second_BOPUS = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("RegistryData",
		"First", "Registry", "TestData.json");
	WeddingRegistry = (String) jsonObjectArray.get("RegistryType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("RegistryData",
		"Second", "Registry", "TestData.json");
	CommitmentCeremonyRegistry = (String) jsonObjectArray
		.get("RegistryType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("RegistryData",
		"Third", "Registry", "TestData.json");
	BabyRegistry = (String) jsonObjectArray.get("RegistryType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("RegistryData",
		"Fourth", "Registry", "TestData.json");
	HousewarmingRegistry = (String) jsonObjectArray.get("RegistryType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("RegistryData",
		"Fifth", "Registry", "TestData.json");
	AnniversaryRegistry = (String) jsonObjectArray.get("RegistryType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("RegistryData",
		"Sixth", "Registry", "TestData.json");
	UniversityRegistry = (String) jsonObjectArray.get("RegistryType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("RegistryData",
		"Seventh", "Registry", "TestData.json");
	BirthdayRegistry = (String) jsonObjectArray.get("RegistryType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("RegistryData",
		"Eight", "Registry", "TestData.json");
	RetirementRegistry = (String) jsonObjectArray.get("RegistryType");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("RegistryData",
		"Ninth", "Registry", "TestData.json");
	OtherRegistry = (String) jsonObjectArray.get("RegistryType");
	PLPSortByValue = (String) jsonObject.get("PLPSortByValue");
	password = (String) jsonObject.get("password");
	searchKeyword = (String) jsonObject.get("searchKeyword");
	refinedSearchKeyword = (String) jsonObject.get("refinedSearchKeyword");
	Firstname = DataMgr.shuffle(DataMgr.randString());
	Lastname = DataMgr.shuffle(DataMgr.randString());
	Address1 = (String) jsonObject.get("Address1");
	CityName = (String) jsonObject.get("CityName");
	CityName1 = (String) jsonObject.get("CityName1");
	Address2 = (String) jsonObject.get("Address2");
	FirstnameIntl = (String) jsonObject.get("FirstnameIntl");
	LastnameIntl = (String) jsonObject.get("LastnameIntl");
	Address1Intl = (String) jsonObject.get("Address1Intl");
	CityNameIntl = (String) jsonObject.get("CityNameIntl");
	CountryName = (String) jsonObject.get("CountryName");
	ZipIntl = (String) jsonObject.get("ZipIntl");
	EmailIntl = (String) jsonObject.get("EmailIntl");
	InvalidBillingAddress1 = (String) jsonObject
		.get("InvalidBillingAddress1");
	InvalidBillingZIP = (String) jsonObject.get("InvalidBillingZIP");
	InvalidBillingCity = (String) jsonObject.get("InvalidBillingCity");
	InvalidBillingLastName = (String) jsonObject
		.get("InvalidBillingLastName");
	Zip = (String) jsonObject.get("Zip");
	PostalCode = (String) jsonObject.get("PostalCode");
	StateName = (String) jsonObject.get("StateName");
	Province = (String) jsonObject.get("Province");
	Email = (String) jsonObject.get("Email");
	FriendEmail = (String) jsonObject.get("FriendEmail");
	FriendEmail_New = (String) jsonObject.get("FriendEmail_New");
	VDC_LearnMoreMessage = (String) jsonObject.get("VDC_LearnMoreMessage");
	VDC_LearnMoreMessageSecond = (String) jsonObject
		.get("VDC_LearnMoreMessageSecond");
	VDC_OffsetMessageMultiship = (String) jsonObject
		.get("VDC_OffsetMessageMultiship");
	ConfirmEmail = (String) jsonObject.get("ConfirmEmail");
	PhoneNumber = (String) jsonObject.get("PhoneNumber");
	PhoneNumberIntl = (String) jsonObject.get("PhoneNumberIntl");
	CardType = (String) jsonObject.get("CardType");
	CardMonth = (String) jsonObject.get("CardMonth");
	CardMonthIntl = (String) jsonObject.get("CardMonthIntl");
	CardYear = (String) jsonObject.get("CardYear");
	CardNumber = (String) jsonObject.get("CardNumber");
	CardNumberMaster = (String) jsonObject.get("CardNumberMaster");
	SecurityCode = (String) jsonObject.get("SecurityCode");
	NameOnCard = (String) jsonObject.get("NameOnCard");
	Zip_FIS = (String) jsonObject.get("Zip_FIS");
	RegistryNumber_US = (String) jsonObject.get("RegistryNumber_US");
	RegistryNumber_Baby = (String) jsonObject.get("RegistryNumber_Baby");
	RegistryNumber_CA = (String) jsonObject.get("RegistryNumber_CA");
	Company = (String) jsonObject.get("Company");
	NameOnCard = (String) jsonObject.get("NameOnCard");
	CountryNameAMEX = (String) jsonObject.get("CountryNameAMEX");
	CardNumber_AMEX = (String) jsonObject.get("CardNumber_AMEX");
	AMEX_Card_Type = (String) jsonObject.get("AMEX_Card_Type");
	SecurityCode = (String) jsonObject.get("SecurityCode");
	EmailUpdate = (String) jsonObject.get("EmailUpdate");
	FirstnameUpdate = (String) jsonObject.get("FirstnameUpdate");
	LastnameUpdate = (String) jsonObject.get("LastnameUpdate");
	PasswordUpdate = (String) jsonObject.get("PasswordUpdate");
	FaceBookEmail = (String) jsonObject.get("FaceBookEmail");
	FaceBookPassword = (String) jsonObject.get("FaceBookPassword");
	Color = (String) jsonObject.get("Color");
	DeliveryMethod = (String) jsonObject.get("DeliveryMethod");
	Bedding_Search = (String) jsonObject.get("Bedding_Search");
	Standard_Method = (String) jsonObject.get("Standard_Method");
	Expedited_Method = (String) jsonObject.get("Expedited_Method");
	Express_Method = (String) jsonObject.get("Express_Method");
	PaypalEmail = (String) jsonObject.get("PaypalEmail");
	PaypalEmailCA = (String) jsonObject.get("PaypalEmailCA");
	PaypalPassword = (String) jsonObject.get("PaypalPassword");
	GiftCardNumber = (String) jsonObject.get("GiftCardNumber");
	GiftCardPin = (String) jsonObject.get("GiftCardPin");
	GiftMessage = (String) jsonObject.get("GiftMessage");
	ProductQuantity = (String) jsonObject.get("ProductQuantity");
	validAddress1 = (String) jsonObject.get("ValidAddress1");
	validAddress2 = (String) jsonObject.get("ValidAddress2");
	Omniture = (String) jsonObject.get("Omniture");
	validCityName = (String) jsonObject.get("ValidCityName");
	validZip = (String) jsonObject.get("ValidZip");
	validStateName = (String) jsonObject.get("ValidStateName");
	registryTypes = (String) jsonObject.get("registryTypes");

	InvalidFirstNameError = (String) jsonObject
		.get("InvalidFirstNameError");
	InvalidLastNameError = (String) jsonObject.get("InvalidLastNameError");
	InvalidCityNameError = (String) jsonObject.get("InvalidCityNameError");
	InvalidAddressError = (String) jsonObject.get("InvalidAddressError");
	InvalidZipError = (String) jsonObject.get("InvalidZipError");
	InvalidStateError = (String) jsonObject.get("InvalidStateError");
	AccessoryProductTitle_US = (String) jsonObject
		.get("AccessoryProductTitle_US");
	AccessoryProductTitle_Baby = (String) jsonObject
		.get("AccessoryProductTitle_Baby");
	AccessoryProductTitle_CA = (String) jsonObject
		.get("AccessoryProductTitle_CA");
	CollectionProductTitle_US = (String) jsonObject
		.get("CollectionProductTitle_US");
	CollectionProductTitle_Baby = (String) jsonObject
		.get("CollectionProductTitle_Baby");
	CollectionProductTitle_CA = (String) jsonObject
		.get("CollectionProductTitle_CA");
	validStateName1 = (String) jsonObject.get("validStateName1");
	validAddress1CA = (String) jsonObject.get("ValidAddress1CA");
	validAddress2CA = (String) jsonObject.get("ValidAddress2CA");
	validCityNameCA = (String) jsonObject.get("ValidCityNameCA");
	BillingAddress_CompanyName = (String) jsonObject
		.get("BillingAddress_CompanyName");

	validZipCA = (String) jsonObject.get("ValidZipCA");
	validStateNameCA = (String) jsonObject.get("ValidStateNameCA");
	refinedSearchInvalidKeyword = (String) jsonObject
		.get("refinedSearchInvalidKeyword");
	refinedSearchOneResult = (String) jsonObject
		.get("refinedSearchOneResult");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InternationalRestrictedRegular", "prod_Type", "TestData.json");
	InternationalRestrictedRegular = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InternationalRestrictedRegularBaby", "prod_Type",
		"TestData.json");
	InternationalRestrictedRegularBaby = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InternationalRestrictedCollection", "prod_Type",
		"TestData.json");
	InternationalRestrictedCollection = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InternationalRestrictedCollectionBaby", "prod_Type",
		"TestData.json");
	InternationalRestrictedCollectionBaby = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InternationalRestrictedAccessory", "prod_Type",
		"TestData.json");
	InternationalRestrictedAccessory = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InternationalRestrictedAccessoryBaby", "prod_Type",
		"TestData.json");
	InternationalRestrictedAccessoryBaby = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"VDC", "prod_Type", "TestData.json");
	VDC = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"VDC_Baby", "prod_Type", "TestData.json");
	VDCBabyId = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Registry", "prod_Type", "TestData.json");
	Registry = (String) jsonObjectArray.get("ProductIDOrName");

	ReviewTitle = (String) jsonObject.get("ReviewTitle");
	ReviewDetailedTextField = (String) jsonObject
		.get("ReviewDetailedTextField");
	NickName = (String) jsonObject.get("NickName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"L2_Keyword", "prod_Type", "TestData.json");
	L2_Keyword = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"L2_KeywordBaby", "prod_Type", "TestData.json");
	L2_KeywordBaby = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"L2_KeywordCA", "prod_Type", "TestData.json");
	L2_KeywordCA = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Brand_Keyword", "prod_Type", "TestData.json");
	Brand_Keyword = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Brand_KeywordBaby", "prod_Type", "TestData.json");
	Brand_KeywordBaby = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Brand_KeywordCA", "prod_Type", "TestData.json");
	Brand_KeywordCA = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Department_Keyword", "prod_Type", "TestData.json");
	Department_Keyword = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Department_KeywordBaby", "prod_Type", "TestData.json");
	Department_KeywordBaby = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Department_KeywordCA", "prod_Type", "TestData.json");
	Department_KeywordCA = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Keyword_Redirect_Text", "prod_Type", "TestData.json");
	Keyword_Redirect_Text = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Keyword_Redirect_TextBaby", "prod_Type", "TestData.json");
	Keyword_Redirect_TextBaby = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Keyword_Redirect_TextCA", "prod_Type", "TestData.json");
	Keyword_Redirect_TextCA = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Keyword_Redirect_Facet_Applied", "prod_Type", "TestData.json");
	Keyword_Redirect_Facet_Applied = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Keyword_Redirect_Facet_AppliedBaby", "prod_Type",
		"TestData.json");
	Keyword_Redirect_Facet_AppliedBaby = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"partialSearchKeyword_US", "prod_Type", "TestData.json");
	partialSearchKeyword_US = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"partialSearchKeyword_Baby", "prod_Type", "TestData.json");
	partialSearchKeyword_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"partialSearchKeyword_CA", "prod_Type", "TestData.json");
	partialSearchKeyword_CA = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Keyword_Redirect_Facet_AppliedCA", "prod_Type",
		"TestData.json");
	Keyword_Redirect_Facet_AppliedCA = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ExpandableColorMultiSKU_Baby", "prod_Type", "TestData.json");
	ExpandableColorMultiSKU_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ExpandableColorMultiSKU", "prod_Type", "TestData.json");
	ExpandableColorMultiSKU = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"VideoandGuidesAndAdvice_Baby", "prod_Type", "TestData.json");
	VideoandGuidesAndAdvice_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"VideoandGuidesAndAdvice", "prod_Type", "TestData.json");
	VideoandGuidesAndAdvice = (String) jsonObjectArray
		.get("ProductIDOrName");

	AnotherZipCode = (String) jsonObject.get("AnotherZipCode");

	AccessorySingleSKUProductTitle_US = (String) jsonObject
		.get("AccessorySingleSKUProductTitle_US");
	AccessorySingleSKUProductTitle_Baby = (String) jsonObject
		.get("AccessorySingleSKUProductTitle_Baby");
	AccessorySingleSKUProductTitle_CA = (String) jsonObject
		.get("AccessorySingleSKUProductTitle_CA");

	EditAddressFirstname = (String) jsonObject.get("EditAddressFirstname");
	NewZipCode = (String) jsonObject.get("NewZipCode");

	EditAddressLastname = (String) jsonObject.get("EditAddressLastname");
	newResetpassword = (String) jsonObject.get("newResetpassword");
	resetConfirmPassword = (String) jsonObject.get("resetConfirmPassword");

	ValidAddress3 = (String) jsonObject.get("ValidAddress3");
	validCityName2 = (String) jsonObject.get("ValidCityName2");
	validZip2 = (String) jsonObject.get("ValidZip2");
	validStateName2 = (String) jsonObject.get("ValidStateName2");
	validAddress1CA2 = (String) jsonObject.get("ValidAddress1CA2");
	validCityNameCA2 = (String) jsonObject.get("ValidCityNameCA2");
	validZipCA2 = (String) jsonObject.get("ValidZipCA2");
	validStateNameCA2 = (String) jsonObject.get("ValidStateNameCA2");
	refinedSearchKeywordForPartialResult = (String) jsonObject
		.get("refinedSearchKeywordForPartialResult");
	refinedSearchKeywordForPartialResultUS = (String) jsonObject
		.get("refinedSearchKeywordForPartialResultUS");
	ArrayList<String> giftCard1 = new ArrayList<String>();
	giftCard1
		.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
			"First", "GiftCardDesc", "TestData.json").get(
			"GiftCardNumber"));
	giftCard1.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
		"First", "GiftCardDesc", "TestData.json").get("GiftCardPin"));
	GiftCards.add(giftCard1);
	ArrayList<String> giftCard2 = new ArrayList<String>();
	giftCard2.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
		"Second", "GiftCardDesc", "TestData.json")
		.get("GiftCardNumber"));
	giftCard2.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
		"Second", "GiftCardDesc", "TestData.json").get("GiftCardPin"));
	GiftCards.add(giftCard2);
	ArrayList<String> giftCard3 = new ArrayList<String>();
	giftCard3
		.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
			"Third", "GiftCardDesc", "TestData.json").get(
			"GiftCardNumber"));
	giftCard3.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
		"Third", "GiftCardDesc", "TestData.json").get("GiftCardPin"));
	GiftCards.add(giftCard3);
	ArrayList<String> giftCard4 = new ArrayList<String>();
	giftCard4.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
		"Fourth", "GiftCardDesc", "TestData.json")
		.get("GiftCardNumber"));
	giftCard4.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
		"Fourth", "GiftCardDesc", "TestData.json").get("GiftCardPin"));
	GiftCards.add(giftCard4);
	ArrayList<String> giftCard5 = new ArrayList<String>();
	giftCard5
		.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
			"Fifth", "GiftCardDesc", "TestData.json").get(
			"GiftCardNumber"));
	giftCard5.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
		"Fifth", "GiftCardDesc", "TestData.json").get("GiftCardPin"));
	GiftCards.add(giftCard5);

	ArrayList<String> giftCard6 = new ArrayList<String>();
	giftCard6
		.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
			"Sixth", "GiftCardDesc", "TestData.json").get(
			"GiftCardNumber"));
	giftCard6.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
		"Sixth", "GiftCardDesc", "TestData.json").get("GiftCardPin"));
	GiftCards.add(giftCard6);

	ArrayList<String> giftCard7 = new ArrayList<String>();
	giftCard7.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
		"Seventh", "GiftCardDesc", "TestData.json").get(
		"GiftCardNumber"));
	giftCard7.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
		"Seventh", "GiftCardDesc", "TestData.json").get("GiftCardPin"));
	GiftCards.add(giftCard7);

	ArrayList<String> giftCard8 = new ArrayList<String>();
	giftCard8.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
		"Eighth", "GiftCardDesc", "TestData.json")
		.get("GiftCardNumber"));
	giftCard8.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
		"Eighth", "GiftCardDesc", "TestData.json").get("GiftCardPin"));
	GiftCards.add(giftCard8);

	ArrayList<String> giftCard9 = new ArrayList<String>();
	giftCard9
		.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
			"Ninth", "GiftCardDesc", "TestData.json").get(
			"GiftCardNumber"));
	giftCard9.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
		"Ninth", "GiftCardDesc", "TestData.json").get("GiftCardPin"));
	GiftCards.add(giftCard9);

	ArrayList<String> giftCard10 = new ArrayList<String>();
	giftCard10
		.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
			"Tenth", "GiftCardDesc", "TestData.json").get(
			"GiftCardNumber"));
	giftCard10.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
		"Tenth", "GiftCardDesc", "TestData.json").get("GiftCardPin"));
	GiftCards.add(giftCard10);

	ArrayList<String> giftCard11 = new ArrayList<String>();
	giftCard11.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
		"Eleventh", "GiftCardDesc", "TestData.json").get(
		"GiftCardNumber"));
	giftCard11
		.add((String) DataMgr.fetchDataJsonArrayObject("Gift_Card",
			"Eleventh", "GiftCardDesc", "TestData.json").get(
			"GiftCardPin"));
	GiftCards.add(giftCard11);

	GiftCard25Number = (String) jsonObject.get("GiftCard25Number");
	GiftCard25Pin = (String) jsonObject.get("GiftCard25Pin");
	BlackColorMultiSku = (String) jsonObject.get("BLACK");
	GiftCardInvalidNumber = (String) jsonObject
		.get("GiftCardInvalidNumber");
	GiftCardInvalidPin = (String) jsonObject.get("GiftCardInvalidPin");
	sorByNewest = (String) jsonObject.get("sorByNewest");
	pagFilterValue = (String) jsonObject.get("pagFilterValue");
	CouponEmail = (String) jsonObject.get("CouponEmail");
	CountryMexico = (String) jsonObject.get("CountryMexico");
	StateNameIntl = (String) jsonObject.get("StateNameIntl");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"OutOfStockSingleSKUBaby", "prod_Type", "TestData.json");
	OutOfStockSingleSKUBaby = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"OutOfStockMultiSKUBaby", "prod_Type", "TestData.json");
	OutOfStockMultiSKUBaby = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"OutOfStockLTLBaby", "prod_Type", "TestData.json");
	OutOfStockLTLBaby = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"OutOfStockLeadBaby", "prod_Type", "TestData.json");
	OutOfStockLeadBaby = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"OutOfStockCollectionBaby", "prod_Type", "TestData.json");
	OutOfStockCollectionBaby = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"OutOfStockSingleSKUCA", "prod_Type", "TestData.json");
	OutOfStockSingleSKUCA = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"OutOfStockMultiSKUCA", "prod_Type", "TestData.json");
	OutOfStockMultiSKUCA = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"OutOfStockLeadCA", "prod_Type", "TestData.json");
	OutOfStockLeadCA = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"OutOfStockCollectionCA", "prod_Type", "TestData.json");
	OutOfStockCollectionCA = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"OutOfStockSingleSKU", "prod_Type", "TestData.json");
	OutOfStockSingleSKU = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"OutOfStockMultiSKU", "prod_Type", "TestData.json");
	OutOfStockMultiSKU = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"OutOfStockLTL", "prod_Type", "TestData.json");
	OutOfStockLTL = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"OutOfStockLead", "prod_Type", "TestData.json");
	OutOfStockLead = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"OutOfStockCollection", "prod_Type", "TestData.json");
	OutOfStockCollection = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Two_Character", "prod_Type", "TestData.json");
	Two_Characters = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"One_Character", "prod_Type", "TestData.json");
	One_Character = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Zip_Restricted", "prod_Type", "TestData.json");
	Zip_RestrictedProductId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Zip_Restricted_Baby", "prod_Type", "TestData.json");
	Zip_RestrictedProductBabyId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Expedited_Restricted", "prod_Type", "TestData.json");
	Expedited_RestrictedProductId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"Expedited_RestrictedBaby", "prod_Type", "TestData.json");
	Expedited_RestrictedProductBabyId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"invalid_product", "prod_Type", "TestData.json");
	invalid_product = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InternationalRestrictedMultiSKU_US", "prod_Type",
		"TestData.json");
	InternationalRestrictedMultiSKU_US = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"InternationalRestrictedMultiSKU_Baby", "prod_Type",
		"TestData.json");
	InternationalRestrictedMultiSKU_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	PaypalCouponEmail = (String) jsonObject.get("PaypalCouponEmail");
	RestrictedCityName = (String) jsonObject.get("RestrictedCityName");
	RestrictedZip = (String) jsonObject.get("RestrictedZip");
	RestrictedStateName = (String) jsonObject.get("RestrictedStateName");
	SFLItemNonBopusFlaggedoff_EmailID = (String) jsonObject
		.get("SFLItemNonBopusFlaggedoff_EmailID");
	SFLItemFlaggedoff_EmailID = (String) jsonObject
		.get("SFLItemFlaggedoff_EmailID");
	CartItemFlaggedoffRegistry_EmailID = (String) jsonObject
		.get("CartItemFlaggedoffRegistry_EmailID");
	CartItemFlaggedoff_EmailID = (String) jsonObject
		.get("CartItemFlaggedoff_EmailID");
	SFLItemNonBopusFlaggedoff_EmailIDBaby = (String) jsonObject
		.get("SFLItemNonBopusFlaggedoff_EmailIDBaby");
	SFLItemFlaggedoff_EmailIDBaby = (String) jsonObject
		.get("SFLItemFlaggedoff_EmailIDBaby");
	CartItemFlaggedoffRegistry_EmailIDBaby = (String) jsonObject
		.get("CartItemFlaggedoffRegistry_EmailIDBaby");
	CartItemFlaggedoff_EmailIDBaby = (String) jsonObject
		.get("CartItemFlaggedoff_EmailIDBaby");
	SFLItemNonBopusFlaggedoff_EmailIDCA = (String) jsonObject
		.get("SFLItemNonBopusFlaggedoff_EmailIDCA");
	SFLItemFlaggedoff_EmailIDCA = (String) jsonObject
		.get("SFLItemFlaggedoff_EmailIDCA");
	CartItemFlaggedoffRegistry_EmailIDCA = (String) jsonObject
		.get("CartItemFlaggedoffRegistry_EmailIDCA");
	CartItemFlaggedoff_EmailIDCA = (String) jsonObject
		.get("CartItemFlaggedoff_EmailIDCA");
	CartOOSREgistryItem_US = (String) jsonObject
		.get("CartOOSREgistryItem_US");
	CartOOSREgistryItem_CA = (String) jsonObject
		.get("CartOOSREgistryItem_CA");
	CartOOSREgistryItem_Baby = (String) jsonObject
		.get("CartOOSREgistryItem_Baby");
	AppointmentZip = (String) jsonObject.get("AppointmentZip");
	GuestRegistryIdHavingRequiredItems_US = (String) jsonObject
		.get("GuestRegistryIdHavingRequiredItems_US1");
	GuestRegistryIdHavingRequiredItems_Baby = (String) jsonObject
		.get("GuestRegistryIdHavingRequiredItems_Baby1");
	GuestRegistryIdHavingRequiredItems_CA = (String) jsonObject
		.get("GuestRegistryIdHavingRequiredItems_CA1");
	RegistryNumber2_US = (String) jsonObject.get("RegistryNumber2_US");
	RegistryNumber2_Baby = (String) jsonObject.get("RegistryNumber2_Baby");
	RegistryNumber2_CA = (String) jsonObject.get("RegistryNumber2_CA");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"EverlivingProduct", "prod_Type", "TestData.json");
	EverlivingProduct = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("userdata",
		"omniture_user", "usr_desc", "TestData.json");
	omnitureUserEmail = (String) jsonObjectArray.get("username");
	CouponEmailOmniture = (String) jsonObject.get("CouponEmailOmniture");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ProductWithOmniProm123Attached", "prod_Type", "TestData.json");
	ProductWithOmniProm123AttachedId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"ProductWithSurcharge", "prod_Type", "TestData.json");
	ProductWithSurchargeId = (String) jsonObjectArray
		.get("ProductIDOrName");
	Zip_FindInStore = (String) jsonObject.get("Zip_FindInStore");
	ZipLowStockQuantity1_CA = (String) jsonObject
		.get("ZipLowStockQuantity1_CA");
	ZipLowStockQuantity1_Baby = (String) jsonObject
		.get("ZipLowStockQuantity1_Baby");
	ZipLowStockQuantity1_US = (String) jsonObject
		.get("ZipLowStockQuantity1_US");
	ValidZipCA_NotAvailable = (String) jsonObject
		.get("ValidZipCA_NotAvailable");
	ValidZipCA_ReserveOnline = (String) jsonObject
		.get("ValidZipCA_ReserveOnline");
	QuebecState = (String) jsonObject.get("QuebecState");
	ValidStreetName = (String) jsonObject.get("ValidStreetName");
	ValidStreetNameCA = (String) jsonObject.get("ValidStreetNameCA");
	OtherZip = (String) jsonObject.get("OtherZip");
	ChallengeQuestion1 = (String) jsonObject.get("ChallengeQuestion1");
	ChallengeAnswer1 = (String) jsonObject.get("ChallengeAnswer1");
	ChallengeQuestion2 = (String) jsonObject.get("ChallengeQuestion2");
	ChallengeAnswer2 = (String) jsonObject.get("ChallengeAnswer2");
	CouponEmail_CouponWallet = (String) jsonObject
		.get("CouponEmail_CouponWallet");
	AddressSearchText = (String) jsonObject.get("AddressSearchText");
	SecurityCodeAmex = (String) jsonObject.get("SecurityCodeAmex");
	Latitude_US_SSWP = (String) jsonObject.get("Latitude_US_SSWP");
	Longitude_US_SSWP = (String) jsonObject.get("Longitude_US_SSWP");
	Latitude_US_MSWP = (String) jsonObject.get("Latitude_US_MSWP");
	Longitude_US_MSWP = (String) jsonObject.get("Longitude_US_MSWP");
	Latitude_US_Accessory = (String) jsonObject
		.get("Latitude_US_Accessory");
	Longitude_US_Accessory = (String) jsonObject
		.get("Longitude_US_Accessory");
	Latitude_Baby_SSWP = (String) jsonObject.get("Latitude_Baby_SSWP");
	Longitude_Baby_SSWP = (String) jsonObject.get("Longitude_Baby_SSWP");
	Latitude_Baby_MSWP = (String) jsonObject.get("Latitude_Baby_MSWP");
	Longitude_Baby_MSWP = (String) jsonObject.get("Longitude_Baby_MSWP");
	Latitude_Baby_Accessory = (String) jsonObject
		.get("Latitude_Baby_Accessory");
	Longitude_Baby_Accessory = (String) jsonObject
		.get("Longitude_Baby_Accessory");

	Latitude_CA_SSWP = (String) jsonObject.get("Latitude_CA_SSWP");
	Longitude_CA_SSWP = (String) jsonObject.get("Longitude_CA_SSWP");
	Latitude_CA_MSWP = (String) jsonObject.get("Latitude_CA_MSWP");
	Longitude_CA_MSWP = (String) jsonObject.get("Longitude_CA_MSWP");
	Latitude_CA_Accessory = (String) jsonObject
		.get("Latitude_CA_Accessory");
	Longitude_CA_Accessory = (String) jsonObject
		.get("Longitude_CA_Accessory");
	zip_SSWP_US = (String) jsonObject.get("zip_SSWP_US");
	zip_SSWP_Baby = (String) jsonObject.get("zip_SSWP_Baby");
	zip_SSWP_CA = (String) jsonObject.get("zip_SSWP_US");

	StoreZip_SSWP_US = (String) jsonObject.get("StoreZip_SSWP_US");
	StoreZip_SSWP_Baby = (String) jsonObject.get("StoreZip_SSWP_Baby");
	StoreZip_SSWP_CA = (String) jsonObject.get("StoreZip_SSWP_CA");

	zip_MSWP_US = (String) jsonObject.get("zip_MSWP_US");
	zip_MSWP_Baby = (String) jsonObject.get("zip_MSWP_Baby");
	zip_MSWP_CA = (String) jsonObject.get("zip_MSWP_US");

	CardHolderName = (String) jsonObject.get("CardHolderName");

	ValidVisaCard = (String) jsonObject.get("ValidVisaCard");
	StoreZip_MSWP_US = (String) jsonObject.get("StoreZip_MSWP_US");
	StoreZip_MSWP_Baby = (String) jsonObject.get("StoreZip_MSWP_Baby");
	StoreZip_MSWP_CA = (String) jsonObject.get("StoreZip_MSWP_CA");

	zip_Accessory_US = (String) jsonObject.get("zip_Accessory_US");
	zip_Accessory_Baby = (String) jsonObject.get("zip_Accessory_Baby");
	zip_Accessory_CA = (String) jsonObject.get("zip_Accessory_US");

	StoreZip_Accessory_US = (String) jsonObject
		.get("StoreZip_Accessory_US");
	StoreZip_Accessory_Baby = (String) jsonObject
		.get("StoreZip_Accessory_Baby");
	StoreZip_Accessory_CA = (String) jsonObject
		.get("StoreZip_Accessory_CA");

	ApiCategoryId_US = (String) jsonObject.get("ApiCategoryId_US");
	ApiCategoryId_BABY = (String) jsonObject.get("ApiCategoryId_BABY");
	ApiCategoryId_CA = (String) jsonObject.get("ApiCategoryId_CA");

	DefaultRadius_US = (String) jsonObject.get("DefaultRadius_US");
	DefaultRadius_Baby = (String) jsonObject.get("DefaultRadius_Baby");
	DefaultRadius_CA = (String) jsonObject.get("DefaultRadius_CA");
	DefaultUpdatedRadius_US = (String) jsonObject
		.get("DefaultUpdatedRadius_US");
	DefaultUpdatedRadius_Baby = (String) jsonObject
		.get("DefaultUpdatedRadius_Baby");
	DefaultUpdatedRadius_CA = (String) jsonObject
		.get("DefaultUpdatedRadius_CA");
	Latitude_Invalid = (String) jsonObject.get("Latitude_Invalid");
	Longitude_Invalid = (String) jsonObject.get("Longitude_Invalid");
	AddressSearchTextCompleteCA = (String) jsonObject
		.get("AddressSearchTextCompleteCA");
	AddressSearchTextCompleteUS = (String) jsonObject
		.get("AddressSearchTextCompleteUS");
	CountryName_Aruba = (String) jsonObject.get("CountryName_Aruba");
	PO_BOX_AddressSearchTextCompleteUS = (String) jsonObject
		.get("PO_BOX_AddressSearchTextCompleteUS");
	PilotZipUS = (String) jsonObject.get("PilotZipUS");
	PilotZipBaby = (String) jsonObject.get("PilotZipBaby");
	NonPilotZip = (String) jsonObject.get("NonPilotZip");
	InCartLabel = (String) jsonObject.get("InCartLabel");
	InCartDisclaimer1 = (String) jsonObject.get("InCartDisclaimer1");
	InCartDisclaimer2 = (String) jsonObject.get("InCartDisclaimer2");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"WithTwoLetter", "prod_Type", "TestData.json");
	WithTwoLetter = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"SDDSingleSKU", "prod_Type", "TestData.json");
	SDDSingleSKU = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"SDDSingleSKUBaby", "prod_Type", "TestData.json");
	SDDSingleSKUBaby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"SDDMultiSKU", "prod_Type", "TestData.json");
	SDDMultiSKU = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"WithTwoLetters", "prod_Type", "TestData.json");
	WithTwoLetters = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"WithTwoKeywords", "prod_Type", "TestData.json");
	WithTwoKeywords = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"WithThreeKeywords", "prod_Type", "TestData.json");
	WithThreeKeywords = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("productdata",
		"SDDLeadSKU", "prod_Type", "TestData.json");
	SDDLeadSKU = (String) jsonObjectArray.get("ProductIDOrName");
	CountryName_Bermuda = (String) jsonObject.get("CountryName_Bermuda");
	InCartLabelMiniCart = (String) jsonObject.get("InCartLabelMiniCart");
	USAddressLine = (String) jsonObject.get("USAddressLine");
	USZipCode = (String) jsonObject.get("USZipCode");
	USCity = (String) jsonObject.get("USCity");
	errorMessageEmailBoxSignIn = (String) jsonObject
		.get("errorMessageEmailBoxSignIn");
	errorMessagePasswordBoxSignIn = (String) jsonObject
		.get("errorMessagePasswordBoxSignIn");
	Creditcardpage_URL = (String) jsonObject.get("Creditcardpage_URL");
	USState = (String) jsonObject.get("USState");
	CMS_Data_id_BABY = (String) jsonObject.get("CMS_Data_id_BABY");
	CMS_Data_id_US = (String) jsonObject.get("CMS_Data_id_US");
	CAAddressLine = (String) jsonObject.get("CAAddressLine");
	CAZipCode = (String) jsonObject.get("CAZipCode");
	CACity = (String) jsonObject.get("CACity");
	CAState = (String) jsonObject.get("CAState");
	PaypalCouponPassword = (String) jsonObject.get("PaypalCouponPassword");
	ZipCode = (String) jsonObject.get("ZipCode");
	HubURL = (String) jsonObject.get("HubURL");
	GiftCardNoErrorMessage = (String) jsonObject
		.get("GiftCardNoErrorMessage");
	GiftCardPINErrorMessage = (String) jsonObject
		.get("GiftCardPINErrorMessage");
	GiftCardNoErrorMessage = (String) jsonObject
		.get("GiftCardNoErrorMessage");
	GiftCardPINErrorMessage = (String) jsonObject
		.get("GiftCardPINErrorMessage");
	GiftCardBalanceRedirectURL = (String) jsonObject
		.get("GiftCardBalanceRedirectURL");
	FISZipCode = (String) jsonObject.get("FISZipCode");
	ValidCityName3 = (String) jsonObject.get("ValidCityName3");
	ValidZipUS = (String) jsonObject.get("ValidZipUS");
	ValidZipBaby = (String) jsonObject.get("ValidZipBaby");
	ValidCityName4 = (String) jsonObject.get("ValidCityName4");
	ValidAddress4 = (String) jsonObject.get("ValidAddress4");
	FreeShippingBadge1 = (String) jsonObject.get("FreeShippingBadge1");
	FreeShippingBadge2 = (String) jsonObject.get("FreeShippingBadge2");
	validStateName3 = (String) jsonObject.get("validStateName3");
	ValidZipCA2 = (String) jsonObject.get("ValidZipCA2");
	ValidCityNameCA = (String) jsonObject.get("ValidCityNameCA");
	ExtraPaypalPassword = (String) jsonObject.get("ExtraPaypalPassword");
	ExtraPayPalEmail = (String) jsonObject.get("ExtraPayPalEmail");
	GiftCardNumber2 = (String) jsonObject.get("GiftCardNumber2");
	GiftCardPin2 = (String) jsonObject.get("GiftCardPin2");
	IncorrectGiftCardNumber = (String) jsonObject
		.get("IncorrectGiftCardNumber");
	IncorrectGiftCardErrorMsg = (String) jsonObject
		.get("IncorrectGiftCardErrorMsg");
	skuID = (String) jsonObject.get("skuID");
	siteID = (String) jsonObject.get("siteID");
	chalengeQuestionmsgText = (String) jsonObject
		.get("chalengeQuestionmsgText");
	chalengeQuestionmsgLink = (String) jsonObject
		.get("chalengeQuestionmsgLink");
	;
	ipAddress = System.getProperty("dbIP",
		(String) jsonObject.get("ipAddress"));
	port = System.getProperty("dbPort", (String) jsonObject.get("port"));
	LoginAPICustomerUserIdForCreateAccount = (String) jsonObject
		.get("LoginAPICustomerUserIdForCreateAccount");
	LoginAPICustomerPasswordIdForCreateAccount = (String) jsonObject
		.get("LoginAPICustomerPasswordIdForCreateAccount");
	LoginAPICustomerUserId = (String) jsonObject
		.get("LoginAPICustomerUserId");
	LoginAPICustomerPassword = (String) jsonObject
		.get("LoginAPICustomerPassword");
	LoginAPICustomerUserIdNone = (String) jsonObject
		.get("LoginAPICustomerUserIdNone");
	LoginAPICustomerPasswordNone = (String) jsonObject
		.get("LoginAPICustomerPasswordNone");
	LoginAPICustomerUserIdMultiple = (String) jsonObject
		.get("LoginAPICustomerUserIdMultiple");
	LoginAPICustomerPasswordMultiple = (String) jsonObject
		.get("LoginAPICustomerPasswordMultiple");

	giftCardBalanceNumberValid = (String) jsonObject
		.get("GiftCardBalanceNumberValid");
	giftCardBalancePinValid = (String) jsonObject
		.get("GiftCardBalancePinValid");

	loginUsernameWithChallengeQuestion = (String) jsonObject
		.get("LoginUsernameWithChallengeQuestion");
	loginPasswordWithChallengeQuestion = (String) jsonObject
		.get("LoginPasswordWithChallengeQuestion");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"RegularProductBabySkuId", "prod_Type", "TestData.json");
	RegularProductBabySkuId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"RegularProductCASkuId", "prod_Type", "TestData.json");
	RegularProductCASkuId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"RegularProductUSSkuId", "prod_Type", "TestData.json");
	RegularProductUSSkuId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"IncartProductBabySkuId", "prod_Type", "TestData.json");
	IncartProductBabySkuId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"IncartProductCASkuId", "prod_Type", "TestData.json");
	IncartProductCASkuId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"IncartProductUSSkuId", "prod_Type", "TestData.json");
	IncartProductUSSkuId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"InvalidProductBabySkuId", "prod_Type", "TestData.json");
	InvalidProductBabySkuId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"InvalidProductCASkuId", "prod_Type", "TestData.json");
	InvalidProductCASkuId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"InvalidProductUSSkuId", "prod_Type", "TestData.json");
	InvalidProductUSSkuId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOgetCompositeServicedata", "ProductBrand",
		"attribute_category", "TestData.json");
	ProductBrandAttributes = jsonObjectArray.get("attributues_name")
		.toString().replaceAll("^.|.$", "").replace("\"", "")
		.split(",");
	;
	ProductBrandAttributePath = (String) jsonObjectArray
		.get("attribute_path");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOgetCompositeServicedata", "ProductSku",
		"attribute_category", "TestData.json");
	ProductSkuAttributes = jsonObjectArray.get("attributues_name")
		.toString().replaceAll("^.|.$", "").replace("\"", "")
		.split(",");
	;
	ProductSkuAttributePath = (String) jsonObjectArray
		.get("attribute_path");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOgetCompositeServicedata", "ProductSkuPriceAttributes",
		"attribute_category", "TestData.json");
	ProductSkuPriceAttributes = jsonObjectArray.get("attributues_name")
		.toString().replaceAll("^.|.$", "").replace("\"", "")
		.split(",");
	;
	ProductSkuPriceAttributePath = (String) jsonObjectArray
		.get("attribute_path");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOgetCompositeServicedata", "ProductSkuAttributes",
		"attribute_category", "TestData.json");
	ProductSkuAttributesI = jsonObjectArray.get("attributues_name")
		.toString().replaceAll("^.|.$", "").replace("\"", "")
		.split(",");
	;
	ProductSkuAttributePathI = (String) jsonObjectArray
		.get("attribute_path");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOgetCompositeServicedata", "ProductReview",
		"attribute_category", "TestData.json");
	ProductReviewAttributes = jsonObjectArray.get("attributues_name")
		.toString().replaceAll("^.|.$", "").replace("\"", "")
		.split(",");
	;
	ProductReviewAttributePath = (String) jsonObjectArray
		.get("attribute_path");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOgetCompositeServicedata", "Root", "attribute_category",
		"TestData.json");
	ProductRootAttributes = jsonObjectArray.get("attributues_name")
		.toString().replaceAll("^.|.$", "").replace("\"", "")
		.split(",");
	;
	ProductRootAttributePath = (String) jsonObjectArray
		.get("attribute_path");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOgetCompositeServicedata", "ProductPrice",
		"attribute_category", "TestData.json");
	ProductPriceAttributes = jsonObjectArray.get("attributues_name")
		.toString().replaceAll("^.|.$", "").replace("\"", "")
		.split(",");
	;
	ProductPriceAttributePath = (String) jsonObjectArray
		.get("attribute_path");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOInCorrectDataMapping", "IncorrectMapping", "attriute_type",
		"TestData.json");
	ProductIncorrectMappingAttributes = jsonObjectArray
		.get("Attribute_Name").toString().replaceAll("^.|.$", "")
		.replace("\"", "").split(",");
	;
	ProductIncorrectMappingAttributesDB = jsonObjectArray
		.get("Attribute_DatabaseName").toString()
		.replaceAll("^.|.$", "").replace("\"", "").split(",");
	;
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"SingleSkuProductUSProductId", "prod_Type", "TestData.json");
	SingleSkuProductUSProductId = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"SingleSkuProductBabyProductId", "prod_Type", "TestData.json");
	SingleSkuProductBabyProductId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"FBTProductBabyProductId", "prod_Type", "TestData.json");
	FBTProductBabyProductId = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"BuyingGuide_baby", "prod_Type", "TestData.json");
	BuyingGuide_baby = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"FBTProductUSProductId", "prod_Type", "TestData.json");
	FBTProductUSProductId = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"LTLUS", "prod_Type", "TestData.json");
	LTLUS = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"LTLMultiSkuUS", "prod_Type", "TestData.json");
	LTLMultiSkuUS = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"LTLBaby", "prod_Type", "TestData.json");
	LTLBaby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"LTLMultiSkuBaby", "prod_Type", "TestData.json");
	LTLMultiSkuBaby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"MultiSkuSizeProductUSProductId", "prod_Type", "TestData.json");
	MultiSkuSizeProductUSProductId = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"MultiSkuSizeProductBabyProductId", "prod_Type",
		"TestData.json");
	MultiSkuSizeProductBabyProductId = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"MultiSkuSizeColorAndSize", "prod_Type", "TestData.json");
	MultiSkuSizeColorAndSize = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"showMoreLinkProduct", "prod_Type", "TestData.json");
	showMoreLinkProduct = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"showMoreLinkProductBaby", "prod_Type", "TestData.json");
	showMoreLinkProductBaby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"multiSkuWithDropdownColorOptions", "prod_Type",
		"TestData.json");
	multiSkuWithDropdownColorOptions = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"multiSkuWithSizeDropdown_US", "prod_Type", "TestData.json");
	multiSkuWithSizeDropdown_US = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"multiSkuWithSizeDropdown_Baby", "prod_Type", "TestData.json");
	multiSkuWithSizeDropdown_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"InvalidProductUSProductId", "prod_Type", "TestData.json");
	InvalidProductUSProductId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"IncartProductUSProductId", "prod_Type", "TestData.json");
	IncartProductUSProductId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"InternationalRestrictedProductUSProductId", "prod_Type",
		"TestData.json");
	InternationalRestrictedProductUSProductId = (String) jsonObjectArray
		.get("ProductIDOrName");
	AddressBookText = (String) jsonObject.get("AddressBookText");
	AddAddressPopupLinkUrl = (String) jsonObject
		.get("AddAddressPopupLinkUrl");
	EditAddressPopupLinkUrl = (String) jsonObject
		.get("EditAddressPopupLinkUrl");
	RemoveAddressPopupLinkUrl = (String) jsonObject
		.get("RemoveAddressPopupLinkUrl");
	AddressBookLinkUrl = (String) jsonObject.get("AddressBookLinkUrl");
	AccountURL = (String) jsonObject.get("AccountURL");
	AccountLeftNavredirectionURL = (String) jsonObject
		.get("AccountLeftNavredirectionURL");
	Incorrect_Password = (String) jsonObject.get("Incorrect_Password");
	Incorrect_Username = (String) jsonObject.get("Incorrect_Username");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"NonIncartProductUSProductId", "prod_Type", "TestData.json");
	NonIncartProductUSProductId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOgetCompositeServicedata", "ProductReviewComposite",
		"attribute_category", "TestData.json");
	ProductReviewCompositeAttributes = jsonObjectArray
		.get("attributues_name").toString().replaceAll("^.|.$", "")
		.replace("\"", "").split(",");
	;
	ProductReviewCompositeAttributePath = (String) jsonObjectArray
		.get("attribute_path");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOgetRelatedCategoryServicedata", "CategoryList",
		"attribute_category", "TestData.json");
	ProductRelatedCategoryAttributes = jsonObjectArray
		.get("attributues_name").toString().replaceAll("^.|.$", "")
		.replace("\"", "").split(",");
	;
	ProductRelatedCategoryAttributePath = (String) jsonObjectArray
		.get("attribute_path");

	expectedCardtype = (List<String>) jsonObject.get("expectedCardtype");

	expectedMonths = (List<String>) jsonObject.get("expectedMonths");

	jsonObjectArray = DataMgr
		.fetchDataJsonArrayObject("FEOproductdata",
			"InvalidRatingProductUSProductId", "prod_Type",
			"TestData.json");

	InvalidRatingProductUSProductId = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"InvalidRatingProductBABYProductId", "prod_Type",
		"TestData.json");
	InvalidRatingProductBABYProductId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr
		.fetchDataJsonArrayObject("FEOproductdata",
			"InvalidRatingProductCAProductId", "prod_Type",
			"TestData.json");
	InvalidRatingProductCAProductId = (String) jsonObjectArray
		.get("ProductIDOrName");

	expectedYear = (List<String>) jsonObject.get("expectedYear");
	expectedErrorMessageonInvalidName = (List<String>) jsonObject
		.get("expectedErrorMessageonInvalidName");

	Correct_Username = (String) jsonObject.get("Correct_Username");
	Correct_Password = (String) jsonObject.get("Correct_Password");
	SearchDefaultText = (String) jsonObject.get("SearchDefaultText");
	ManageCreditcardpage_URL = (String) jsonObject
		.get("ManageCreditcardpage_URL");
	L2CategoryId = (String) jsonObject.get("L2CategoryId");
	L2CustomerRatedFilter = (String) jsonObject
		.get("L2CustomerRatedFilter");

	SingleSku_BetheFirstRateAndReview = (String) jsonObject
		.get("SingleSku_BetheFirstRateAndReview");
	SingleSku_WasPricingProduct = (String) jsonObject
		.get("SingleSku_WasPricingProduct");
	SingleSku_ShopAllBrandName = (String) jsonObject
		.get("SingleSku_ShopAllBrandName");
	SingleSku_VDC = (String) jsonObject.get("SingleSku_VDC");
	SingleSku_WebCollage = (String) jsonObject.get("SingleSku_WebCollage");
	SingleSku_OOS = (String) jsonObject.get("SingleSku_OOS");
	SingleSku_Accessories = (String) jsonObject
		.get("SingleSku_Accessories");
	L2CategoryIdWithLessThenDefaultValue = (String) jsonObject
		.get("L2CategoryIdWithLessThenDefaultValue");
	L1CategoryId = (String) jsonObject.get("L1CategoryId");
	L3CategoryId = (String) jsonObject.get("L3CategoryId");
	L2CategoryId_4Pagination = (String) jsonObject
		.get("L2CategoryId_4Pagination");
	L2CategoryId_NoPagination = (String) jsonObject
		.get("L2CategoryId_NoPagination");

	L1CategoryName = (String) jsonObject.get("L1CategoryName");
	L2CategoryName = (String) jsonObject.get("L2CategoryName");
	L3CategoryName = (String) jsonObject.get("L3CategoryName");
	L2CategoryId_BreadCrumps = (String) jsonObject
		.get("L2CategoryId_BreadCrumps");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"InvalidRatingProductBothTBSUSProductId", "prod_Type",
		"TestData.json");
	InvalidRatingProductBothTBSUSProductId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"InvalidRatingProductBothTBSBABYProductId", "prod_Type",
		"TestData.json");
	InvalidRatingProductBothTBSBABYProductId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"InvalidRatingProductBothTBSCAProductId", "prod_Type",
		"TestData.json");
	InvalidRatingProductBothTBSCAProductId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"RegularRelatedCategoryUSProductId", "prod_Type",
		"TestData.json");
	RegularRelatedCategoryUSProductId = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOgetRelatedCategoryServicedata", "Root",
		"attribute_category", "TestData.json");
	ProductRelatedCategoryRootAttributes = jsonObjectArray
		.get("attributues_name").toString().replaceAll("^.|.$", "")
		.replace("\"", "").split(",");
	;
	ProductRelatedCategoryRootAttributePath = (String) jsonObjectArray
		.get("attribute_path");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEORelatedCategoryInCorrectDataMapping", "IncorrectMapping",
		"attriute_type", "TestData.json");
	ProductRelatedCategoryIncorrectMappingAttributes = jsonObjectArray
		.get("Attribute_Name").toString().replaceAll("^.|.$", "")
		.replace("\"", "").split(",");
	;
	ProductRelatedCategoryIncorrectMappingAttributesDB = jsonObjectArray
		.get("Attribute_DatabaseName").toString()
		.replaceAll("^.|.$", "").replace("\"", "").split(",");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"SingleSkuProductUSCategory", "prod_Type", "TestData.json");
	SingleSkuProductUSCategory = (String) jsonObjectArray
		.get("CategoryIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"SingleSkuProductBABYCategory", "prod_Type", "TestData.json");
	SingleSkuProductBABYCategory = (String) jsonObjectArray
		.get("CategoryIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"SingleSkuProductCACategory", "prod_Type", "TestData.json");
	SingleSkuProductCACategory = (String) jsonObjectArray
		.get("CategoryIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOgetRelatedCategoryServicedata", "Category",
		"attribute_category", "TestData.json");
	ProductCategoryAttributes = jsonObjectArray.get("attributues_name")
		.toString().replaceAll("^.|.$", "").replace("\"", "")
		.split(",");
	;
	ProductCategoryAttributePath = (String) jsonObjectArray
		.get("attribute_path");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOgetRelatedCategoryServicedata", "Seo_Info",
		"attribute_category", "TestData.json");
	ProductCategorySeoAttributes = jsonObjectArray.get("attributues_name")
		.toString().replaceAll("^.|.$", "").replace("\"", "")
		.split(",");
	;
	ProductCategorySeoAttributePath = (String) jsonObjectArray
		.get("attribute_path");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"InvalidProductUSCategory", "prod_Type", "TestData.json");
	InvalidProductUSCategory = (String) jsonObjectArray
		.get("CategoryIDOrName");
	FeoStoreId = (String) jsonObject.get("FeoStoreId");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOgetStoreServicedata", "Store", "attribute_category",
		"TestData.json");
	StoreRootAttributes = jsonObjectArray.get("attributues_name")
		.toString().replaceAll("^.|.$", "").replace("\"", "")
		.split(",");
	;
	StoreRootAttributePath = (String) jsonObjectArray.get("attribute_path");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOStoreServiceInCorrectDataMapping", "IncorrectMapping",
		"attriute_type", "TestData.json");
	StoreIncorrectMappingAttributes = jsonObjectArray.get("Attribute_Name")
		.toString().replaceAll("^.|.$", "").replace("\"", "")
		.split(",");
	;
	StoreIncorrectMappingAttributesDB = jsonObjectArray
		.get("Attribute_DatabaseName").toString()
		.replaceAll("^.|.$", "").replace("\"", "").split(",");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FetchCreditCarddata", "CreditCard", "attribute_category",
		"TestData.json");
	FetchCreditCardDataAttributes = jsonObjectArray.get("attributues_name")
		.toString().replaceAll("^.|.$", "").replace("\"", "")
		.split(",");
	;
	FetchCreditCardDataAttributePath = (String) jsonObjectArray
		.get("attribute_path");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FetchSingleCreditCarddataExpected", "userSingleCard",
		"usr_desc", "TestData.json");
	FetchSingleCreditCardDataExpected = jsonObjectArray.toJSONString();

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FetchMultipleCreditCardDataExpected", "userMutipleCardCard",
		"usr_desc", "TestData.json");
	FetchMultipleCreditCardDataExpected = jsonObjectArray.toJSONString();

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"AddNewCreditCardData", "ValidCardVisa", "card_desc",
		"TestData.json");
	ValidCreditCardDataVisa = jsonObjectArray.toJSONString();
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"AddNewCreditCardData", "ValidCardVisa", "card_desc",
		"TestData.json");
	ValidCreditCardDataAmex = jsonObjectArray.toJSONString();
	jsonObjectArray = null;
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"AddNewCreditCardData", "InValidCardVisa", "card_desc",
		"TestData.json");
	InValidCreditCardDataVisa = jsonObjectArray.toJSONString();

	InValidCreditCardDataAmex = jsonObjectArray.toJSONString();
	jsonObjectArray = null;
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"AddNewCreditCardData", "InValidCardAmex", "card_desc",
		"TestData.json");

	InValidCreditCardDataAmex = jsonObjectArray.toJSONString();

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FetchCreditCarddata", "CreditCard", "attribute_category",
		"TestData.json");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"AddNewCreditCardData", "ValidCardVisa", "card_desc",
		"TestData.json");
	FetchAddNewCreditCarddataExpected = jsonObjectArray.toJSONString();

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"AddNewCreditCarddata", "CreditCard", "attribute_category",
		"TestData.json");
	AddNewCreditCardDataAttributes = jsonObjectArray
		.get("attributues_name").toString().replaceAll("^.|.$", "")
		.replace("\"", "").split(",");
	;
	AddNewCreditCardDataAttributePath = (String) jsonObjectArray
		.get("attribute_path");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"AddNewCreditCardData", "ValidCardVisaExt", "card_desc",
		"TestData.json");
	ValidCreditCardDataVisaExt = jsonObjectArray.toJSONString();

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"AddNewCreditCardData", "ValidCardVisaEdit", "card_desc",
		"TestData.json");
	ValidCreditCardDataVisaEdit = jsonObjectArray.toJSONString();

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FetchMultipleCreditCardDataExpected", "userMutipleCardCard",
		"usr_desc", "TestData.json");
	FetchEditedCreditCardDataExpected = jsonObjectArray.toJSONString();
	FeoStoreIds = (String) jsonObject.get("FeoStoreIds");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FEOgetStoreByListServicedata", "Store", "attribute_category",
		"TestData.json");
	StoreRootsAttributes = jsonObjectArray.get("attributues_name")
		.toString().replaceAll("^.|.$", "").replace("\"", "")
		.split(",");
	StoreRootsAttributePath = (String) jsonObjectArray
		.get("attribute_path");
	url_EndPointURLStoresByList = (String) jsonObject
		.get("url_EndPointURLStoresByList");

	FeoStoreIdsCA = (String) jsonObject.get("FeoStoreIdsCA");
	FeoStoreIdsInvalid = (String) jsonObject.get("FeoStoreIdsInvalid");
	url_EndPointURLFooterComponent = System.getProperty("apiUrl",
		(String) jsonObject.get("url_EndPointURLFooterComponent"));
	LoginDrupalCustomerUserId = (String) jsonObject
		.get("LoginDrupalCustomerUserId");
	LoginDrupalCustomerPassword = (String) jsonObject
		.get("LoginDrupalCustomerPassword");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"FetchFooterComponentdata", "FooterComponent",
		"attribute_category", "TestData.json");
	FetchFooetrComponentAttributes = jsonObjectArray
		.get("attributues_name").toString().replaceAll("^.|.$", "")
		.replace("\"", "").split(",");
	;
	FetchFooetrComponentAttributePath = (String) jsonObjectArray
		.get("attribute_path");

	// jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
	// "FetchFooterComponentDataExpected", "userSingleCard",
	// "usr_desc", "TestData.json");
	FetchFooterComponentDataExpected = ((JSONArray) jsonObject
		.get("FetchFooterComponentDataExpected")).toJSONString();
	FetchFooetrComponentAttributePathcolumn1 = (String) jsonObjectArray
		.get("attribute_pathColumn1");
	FetchFooetrComponentAttributePathcolumn2 = (String) jsonObjectArray
		.get("attribute_pathColumn2");
	FetchFooetrComponentAttributePathcolumn3 = (String) jsonObjectArray
		.get("attribute_pathColumn3");
	FetchFooetrComponentAttributePathBrands = (String) jsonObjectArray
		.get("attribute_pathBrands");
	FetchFooetrComponentAttributePathSocial = (String) jsonObjectArray
		.get("attribute_pathSocial");

	loginUsernameForResetPassword = (String) jsonObject
		.get("LoginUsernameForResetPassword");
	loginPasswordForResetPassword = (String) jsonObject
		.get("LoginPasswordForResetPassword");

	challengeAnswerFirst = (String) jsonObject.get("ChallengeAnswerFirst");
	challengeAnswerSecond = (String) jsonObject
		.get("ChallengeAnswerSecond");

	createUserFirstName = (String) jsonObject.get("CreateUserFirstName");
	createUserLastName = (String) jsonObject.get("CreateUserLastName");
	createUserPhoneNumber = (String) jsonObject
		.get("CreateUserPhoneNumber");
	createUserMobileNumber = (String) jsonObject
		.get("CreateUserMobileNumber");
	createUserFirstChallengeQuestions = (String) jsonObject
		.get("CreateUserFirstChallengeQuestions");
	createUserSecondChallengeQuestions = (String) jsonObject
		.get("CreateUserSecondChallengeQuestions");
	createUserPassword = (String) jsonObject.get("CreateUserPassword");
	BopusZipCodeUS = (String) jsonObject.get("BopusZipCodeUS");
	createUserConfirmPassword = (String) jsonObject
		.get("CreateUserConfirmPassword");
	createUserNumber = (String) jsonObject.get("CreateUserNumber");
	LoginAPICustomerUserIdToRemove = (String) jsonObject
		.get("LoginAPICustomerUserIdToRemove");
	LoginAPICustomerPasswordToRemove = (String) jsonObject
		.get("LoginAPICustomerPasswordToRemove");
	buyBuyBabyUserSharedAccountFlagTrueLoginId = (String) jsonObject
		.get("BuyBuyBabyUserSharedAccountFlagTrueLoginId");
	buyBuyBabyUserSharedAccountFlagTruePasswordId = (String) jsonObject
		.get("BuyBuyBabyUserSharedAccountFlagTruePasswordId");
	buyBuyBabyUserSharedAccountFlagFalseLoginId = (String) jsonObject
		.get("BuyBuyBabyUserSharedAccountFlagFalseLoginId");
	buyBuyBabyUserSharedAccountFlagFalsePasswordId = (String) jsonObject
		.get("BuyBuyBabyUserSharedAccountFlagFalsePasswordId");
	bedBathCAUserSharedAccountFlagFalseLoginId = (String) jsonObject
		.get("BedBathCAUserSharedAccountFlagFalseLoginId");
	bedBathCAUserSharedAccountFlagFalsePasswordId = (String) jsonObject
		.get("BedBathCAUserSharedAccountFlagFalsePasswordId");
	ValidJsonResultString = (String) jsonObject
		.get("ValidJsonResultString");
	ValidJsonResultStringSDDEligible = (String) jsonObject
		.get("ValidJsonResultStringSDDEligible");
	InvalidJsonResultString = (String) jsonObject
		.get("InvalidJsonResultString");
	InvalidQtyJsonResultString = (String) jsonObject
		.get("InvalidQtyJsonResultString");
	InvalidStoreIdJsonResultString = (String) jsonObject
		.get("InvalidStoreIdJsonResultString");
	InvalidReserveNowJsonResultString = (String) jsonObject
		.get("InvalidReserveNowJsonResultString");
	loginUsernameforChangePassword = (String) jsonObject
		.get("LoginUsernameforChangePassword");
	loginPasswordforChangePassword = (String) jsonObject
		.get("LoginPasswordforChangePassword");
	loginNewPasswordforChangePassword = (String) jsonObject
		.get("LoginNewPasswordforChangePassword");
	insufficientGiftCardBalanceNumber = (String) jsonObject
		.get("InsufficientGiftCardBalanceNumber");
	insufficientGiftCardBalancePin = (String) jsonObject
		.get("InsufficientGiftCardBalancePin");
	catalogReferenceId = (String) jsonObject.get("CatalogReferenceId");
	productReferenceId = (String) jsonObject.get("ProductReferenceId");
	productName = (String) jsonObject.get("ProductName");
	customerName = (String) jsonObject.get("CustomerName");
	myOffersEmailId = (String) jsonObject.get("MyOffersEmailId");
	myOffersPassword = (String) jsonObject.get("MyOffersPassword");
	myOffersMobileNumber = (String) jsonObject.get("MyOffersMobileNumber");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"BillingAddressData", "ValidAddress", "add_desc",
		"TestData.json");
	ValidBillingAddressData = jsonObjectArray.toJSONString();
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"BillingAddressData", "InvalidAddress", "add_desc",
		"TestData.json");
	InvalidBillingAddressData = jsonObjectArray.toJSONString();

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"ShippingMethodData", "ValidSingleShipping", "add_desc",
		"TestData.json");
	ValidSingleShippingMethodData = jsonObjectArray.toJSONString();
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"ShippingMethodData", "ValidMultipleShipping", "add_desc",
		"TestData.json");
	ValidMultipleShippingMethodData = jsonObjectArray.toJSONString();
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"ShippingMethodData", "InvalidSingleShipping", "add_desc",
		"TestData.json");
	InvalidShippingMethodData = jsonObjectArray.toJSONString();

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"SDDShippingMethodData", "ValidShipping", "add_desc",
		"TestData.json");
	ValidSDDShippingMethodData = jsonObjectArray.toJSONString();
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"SDDShippingMethodData", "InvalidShipping", "add_desc",
		"TestData.json");
	InvalidSDDShippingMethodData = jsonObjectArray.toJSONString();
	SecondValidJsonResultString = (String) jsonObject
		.get("SecondValidJsonResultString");
	ValidTypeMiniCart = (String) jsonObject.get("ValidTypeMiniCart");
	InvalidTypeMiniCart = (String) jsonObject.get("InValidTypeMiniCart");
	StateCodeValue = (String) jsonObject.get("StateCodeValue");
	CollegeCodeValue = (String) jsonObject.get("CollegeCodeValue");

	url_EndPointURLSKUDetailBySku = System.getProperty("apiUrl",
		(String) jsonObject.get("url_EndPointURLSKUDetailBySku"));
	url_EndPointURLSKUDetailByProduct = System.getProperty("apiUrl",
		(String) jsonObject.get("url_EndPointURLSKUDetailByProduct"));
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"SkuDetailAPiSKU_Data", "prod_Type", "TestData.json");
	SkuDetailAPiSKU_Data = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"SkuDetailAPi_Product_Data", "prod_Type", "TestData.json");
	SkuDetailAPi_Product_Data = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"DynamicContentData", "Valid", "data_desc", "TestData.json");
	ValidDynamicContentData = jsonObjectArray.toJSONString();
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"DynamicContentData", "Invalid", "data_desc", "TestData.json");
	InvalidDynamicContentData = jsonObjectArray.toJSONString();
	url_EndPointNew = System.getProperty("apiUrl",
		(String) jsonObject.get("url_EndPointNew"));
	url_EndPointDev = System.getProperty("apiUrl",
		(String) jsonObject.get("url_EndPointDev"));
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"ProductDetailAPI_ProductId", "prod_Type", "TestData.json");
	ProductDetailAPI_ProductId = (String) jsonObjectArray
		.get("ProductIDOrName");
	LoginAPINewCustomerUserId = (String) jsonObject
		.get("LoginAPINewCustomerUserId");
	LoginAPINewCustomerPassword = (String) jsonObject
		.get("LoginAPINewCustomerPassword");

	UpdateFirstName = (String) jsonObject.get("UpdateFirstName");
	UpdateLastName = (String) jsonObject.get("UpdateLastName");
	UpdateMobileNumber = (String) jsonObject.get("UpdateMobileNumber");
	UpdatePhoneNumber = (String) jsonObject.get("UpdatePhoneNumber");
	LoginUsernameWithNoChallengeQuestion = (String) jsonObject
		.get("LoginUsernameWithNoChallengeQuestion");
	LoginPasswordWithNoChallengeQuestion = (String) jsonObject
		.get("LoginPasswordWithNoChallengeQuestion");
	LoginAPICustomerUserIdForWishList = (String) jsonObject
		.get("LoginAPICustomerUserIdForWishList");
	LoginAPICustomerPasswordForWishList = (String) jsonObject
		.get("LoginAPICustomerPasswordForWishList");

	LoginAPICustomerUserIdForAddNewAddress = (String) jsonObject
		.get("LoginAPICustomerUserIdForAddNewAddress");
	LoginAPICustomerPasswordForAddNewAddress = (String) jsonObject
		.get("LoginAPICustomerPasswordForAddNewAddress");

	LoginAPICustomerUserIdForEditAddress = (String) jsonObject
		.get("LoginAPICustomerUserIdForEditAddress");
	LoginAPICustomerPasswordForEditAddress = (String) jsonObject
		.get("LoginAPICustomerPasswordForEditAddress");

	LoginAPICustomerUserIdForRemoveAddress = (String) jsonObject
		.get("LoginAPICustomerUserIdForRemoveAddress");
	LoginAPICustomerPasswordForRemoveAddress = (String) jsonObject
		.get("LoginAPICustomerPasswordForRemoveAddress");

	Env_Header = System.getProperty("Env_Header",
		(String) jsonObject.get("Env_Header"));

	LoginUserNameforConfirmPasswordAPI = (String) jsonObject
		.get("LoginUserNameforConfirmPasswordAPI");

	LoginPasswordforConfirmPasswordAPI = (String) jsonObject
		.get("LoginPasswordforConfirmPasswordAPI");

	UsernameChallengeQuestionsExistence = (String) jsonObject
		.get("UsernameChallengeQuestionsExistence");
	PasswordChallengeQuestionsExistence = (String) jsonObject
		.get("PasswordChallengeQuestionsExistence");
	UsernameForLogoutApi = (String) jsonObject.get("UsernameForLogoutApi");
	PasswordForLogoutApi = (String) jsonObject.get("PasswordForLogoutApi");

	UsernameForGetProfileApi = (String) jsonObject
		.get("UsernameForGetProfileApi");
	PasswordForGetProfileApi = (String) jsonObject
		.get("PasswordForGetProfileApi");
	UsernameForUpdateProfileApi = (String) jsonObject
		.get("UsernameForUpdateProfileApi");
	PasswordForUpdateProfileApi = (String) jsonObject
		.get("PasswordForUpdateProfileApi");

	LoginAPICustomerUserIdForPreferredShippingAddress = (String) jsonObject
		.get("LoginAPICustomerUserIdForPreferredShippingAddress");
	LoginAPICustomerPasswordForPreferredShippingAddress = (String) jsonObject
		.get("LoginAPICustomerPasswordForPreferredShippingAddress");
	LoginAPICustomerUserIdForPreferredMailingAddress = (String) jsonObject
		.get("LoginAPICustomerUserIdForPreferredMailingAddress");
	LoginAPICustomerPasswordForPreferredMailingAddress = (String) jsonObject
		.get("LoginAPICustomerPasswordForPreferredMailingAddress");
	LoginAPICustomerUserIdForPreferredBillingAddress = (String) jsonObject
		.get("LoginAPICustomerUserIdForPreferredBillingAddress");
	LoginAPICustomerPasswordPreferredBillingAddress = (String) jsonObject
		.get("LoginAPICustomerPasswordPreferredBillingAddress");
	ProductWithNoRelatedCategory = (String) jsonObject
		.get("ProductWithNoRelatedCategory");
	LoginUsernameData = (String) jsonObject.get("LoginUsernameData");
	LoginPasswordData = (String) jsonObject.get("LoginPasswordData");
	CreditcardEditPage_URL = (String) jsonObject
		.get("CreditcardEditPage_URL");
	ProductWithRelatedCategory = (String) jsonObject
		.get("ProductWithRelatedCategory");
	url_EndPointURLAtg = (String) jsonObject.get("url_EndPointURLAtg");
	SFL_Qty = (String) jsonObject.get("SFL_Qty");
	TrackOrderValidOrderNo = (String) jsonObject
		.get("TrackOrderValidOrderNo");
	TrackOrderInvalidOrderNo = (String) jsonObject
		.get("TrackOrderInvalidOrderNo");
	TrackOrderValidEmailAddress = (String) jsonObject
		.get("TrackOrderValidEmailAddress");
	TrackOrderInvalidEmailAddress = (String) jsonObject
		.get("TrackOrderInvalidEmailAddress");
	TrackInternationalOrderValidOrderNo = (String) jsonObject
		.get("TrackInternationalOrderValidOrderNo");
	TrackInternationalOrderInvalidOrderNo = (String) jsonObject
		.get("TrackInternationalOrderInvalidOrderNo");
	ProductIdWithNoSimilarOOSSection = (String) jsonObject
		.get("ProductIdWithNoSimilarOOSSection");
	MSWPProductWithSimilarOOS = (String) jsonObject
		.get("MSWPProductWithSimilarOOS");

	TrackInternationalOrderValidEmailAddress = (String) jsonObject
		.get("TrackInternationalOrderValidEmailAddress");
	TrackOrderValidUserEmailAddress = (String) jsonObject
		.get("TrackOrderValidUserEmailAddress");
	TrackOrderValidUserPassword = (String) jsonObject
		.get("TrackOrderValidUserPassword");
	TrackOrderInvalidUserPassword = (String) jsonObject
		.get("TrackOrderInvalidUserPassword");
	giftCardBalanceNumberValidsit = (String) jsonObject
		.get("giftCardBalanceNumberValidsit");
	giftCardBalancePinValidsit = (String) jsonObject
		.get("giftCardBalancePinValidsit");
	ProductReferenceIdWithCategoryExist_Baby = (String) jsonObject
		.get("ProductReferenceIdWithCategoryExist_Baby");
	CertonaDataProductId_Baby = (String) jsonObject
		.get("CertonaDataProductId_Baby");
	CertonaDataProductId_US = (String) jsonObject
		.get("CertonaDataProductId_US");
	L2CategoryId_DynamicPricing = (String) jsonObject
		.get("L2CategoryId_DynamicPricing");
	ProductCollection = (String) jsonObject.get("ProductCollection");
	ProductAccessory = (String) jsonObject.get("ProductAccessory");
	MultiSkuAlternateImage = (String) jsonObject
		.get("MultiSkuAlternateImage");
	ProductInStock = (String) jsonObject.get("ProductInStock");
	ProductInStockBaby = (String) jsonObject.get("ProductInStockBaby");
	ValidSkuId = (String) jsonObject.get("ValidSkuId");

	successBodyJson = (String) jsonObject.get("successBodyJson");
	partialBodyJson = (String) jsonObject.get("partialBodyJson");
	promoBannerBodyJson = (String) jsonObject.get("promoBannerBodyJson");
	InValidSkuId = (String) jsonObject.get("InValidSkuId");
	locale = (String) jsonObject.get("locale");
	orderDetailLoggedInUser_EmailId = (String) jsonObject
		.get("orderDetailLoggedInUser_EmailId");
	orderDetailLoggedInUser_Password = (String) jsonObject
		.get("orderDetailLoggedInUser_Password");
	MSWPProductInStock = (String) jsonObject.get("MSWPProductInStock");
	cartPageURL = (String) jsonObject.get("CartPageURL");
	LegacyOrderDetailsofferIDValid = (String) jsonObject
		.get("LegacyOrderDetailsofferIDValid");
	LegacyOrderDetailsofferIDInvalid = (String) jsonObject
		.get("LegacyOrderDetailsofferIDInvalid");
	LegacyOrderDetailsUserID = (String) jsonObject
		.get("LegacyOrderDetailsUserID");
	LegacyOrderDetailsPassword = (String) jsonObject
		.get("LegacyOrderDetailsPassword");
	ValidStoreDataStoreDetailsWithCommerceItems = (String) jsonObject
		.get("ValidStoreDataStoreDetailsWithCommerceItems");
	InvalidStoreDataStoreDetailsWithCommerceItems = (String) jsonObject
		.get("InvalidStoreDataStoreDetailsWithCommerceItems");
	InvalidItemDataStoreDetailsWithCommerceItems = (String) jsonObject
		.get("InvalidItemDataStoreDetailsWithCommerceItems");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("CMSUserdata",
		"CMS_Author", "usr_desc", "TestData.json");
	CMSAuthorUserName = (String) jsonObjectArray.get("username");
	CMSAuthorUserPassword = (String) jsonObjectArray.get("password");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("CMSUserdata",
		"CMS_Reviewer", "usr_desc", "TestData.json");
	CMSReviewerUserName = (String) jsonObjectArray.get("username");
	CMSReviewerUserPassword = (String) jsonObjectArray.get("password");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("CMSUserdata",
		"CMS_Publisher", "usr_desc", "TestData.json");
	CMSPublisherUserName = (String) jsonObjectArray.get("username");
	CMSPublisherUserPassword = (String) jsonObjectArray.get("password");
	ValidPorchJsonResultString = (String) jsonObject
		.get("ValidPorchJsonResultString");
	ValidPorchCartPayLoadResultString = (String) jsonObject
		.get("ValidPorchCartPayLoadResultString");
	resetpasswordemailid = (String) jsonObject.get("resetpasswordemailid");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"DynamicContentData", "Valid_Buying_Guide", "data_desc",
		"TestData.json");
	ValidDynamicContentDataBuying_Guide = jsonObjectArray.toJSONString();
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"DynamicContentData", "Invalid_Buying_Guide", "data_desc",
		"TestData.json");
	InvalidDynamicContentDataBuying_Guide = jsonObjectArray.toJSONString();
	PrefStore_CA = (String) jsonObject.get("PrefStore_CA");
	PrefStore_US = (String) jsonObject.get("PrefStore_US");
	PrefStore_BABY = (String) jsonObject.get("PrefStore_BABY");
	SingleSkuEverlivingURL = (String) jsonObject
		.get("SingleSkuEverlivingURL");
	MultiSkuEverlivingURL = (String) jsonObject
		.get("MultiSkuEverlivingURL");

	if (EnvConfig.Concept.equalsIgnoreCase("us")) {
	    PersonalizedSKUIDAPI = (String) jsonObject
		    .get("PersonalizedSKUIDAPI_US");

	    PersonalizedProductIDAPI = (String) jsonObject
		    .get("PersonalizedProductIDAPI_US");
	} else if (EnvConfig.Concept.equalsIgnoreCase("baby")) {
	    PersonalizedSKUIDAPI = (String) jsonObject
		    .get("PersonalizedSKUIDAPI_Baby");

	    PersonalizedProductIDAPI = (String) jsonObject
		    .get("PersonalizedProductIDAPI_Baby");
	}

	CollectionSkuEverlivingURL = (String) jsonObject
		.get("CollectionSkuEverlivingURL");
	AccessorySkuEverlivingURL = (String) jsonObject
		.get("AccessorySkuEverlivingURL");
	ValidLTLJsonResultString = (String) jsonObject
		.get("ValidLTLJsonResultString");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"ShippingAddressData", "ValidAddress", "add_desc",
		"TestData.json");
	ValidShippingAddressData = jsonObjectArray.toJSONString();
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"ShippingAddressData", "InvalidAddress", "add_desc",
		"TestData.json");
	InvalidShippingAddressData = jsonObjectArray.toJSONString();
	url_EndPointDrupalDev = (String) jsonObject
		.get("url_EndPointDrupalDev");
	url_EndPointDrupalQA = (String) jsonObject.get("url_EndPointDrupalQA");
	url_EndPointDrupalSit = (String) jsonObject
		.get("url_EndPointDrupalSit");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"outOfStockSingleSKUUS", "prod_Type", "TestData.json");
	outOfStockSingleSKUUS = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"outOfStockSingleSKUBaby", "prod_Type", "TestData.json");
	outOfStockSingleSKUBaby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"outOfStockMultiSKUUS", "prod_Type", "TestData.json");
	outOfStockMultiSKUUS = (String) jsonObjectArray.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"CollectionProductUSProductId", "prod_Type", "TestData.json");
	CollectionProductUSProductId = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"AccessoryProductUSProductId", "prod_Type", "TestData.json");
	AccessoryProductUSProductId = (String) jsonObjectArray
		.get("ProductIDOrName");
	cLPPageURL = (String) jsonObject.get("cLPPageURL");

	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObject(
		"FeoSearchKeywordData", "NormalKeyword", "search_keyword",
		"TestData.json");
	NormalKeyword = (String) jsonObjectArray.get("search_keyword_value");

	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObject(
		"FeoSearchKeywordData", "RelatedSearchKeyword",
		"search_keyword", "TestData.json");
	RelatedSearchKeyword = (String) jsonObjectArray
		.get("search_keyword_value");

	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObject(
		"FeoSearchKeywordData", "AutoCorrectSearchKeyword",
		"search_keyword", "TestData.json");
	AutoCorrectSearchKeyword = (String) jsonObjectArray
		.get("search_keyword_value");

	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObject(
		"FeoSearchKeywordData", "DidYouMeanSearchKeyword",
		"search_keyword", "TestData.json");
	DidYouMeanSearchKeyword = (String) jsonObjectArray
		.get("search_keyword_value");
	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObject(
		"FeoSearchKeywordData", "WithoutPaginationResultSearchKeyword",
		"search_keyword", "TestData.json");
	WithoutPaginationResultSearchKeyword = (String) jsonObjectArray
		.get("search_keyword_value");
	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObject(
		"FeoSearchKeywordData", "ZeroResultSearchKeyword",
		"search_keyword", "TestData.json");
	ZeroResultSearchKeyword = (String) jsonObjectArray
		.get("search_keyword_value");
	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObject(
		"FeoSearchKeywordData", "ThreeCharacterSearchKeyword",
		"search_keyword", "TestData.json");
	ThreeCharacterSearchKeyword = (String) jsonObjectArray
		.get("search_keyword_value");
	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObject(
		"FeoSearchKeywordData", "SpaceCharacterSearchKeyword",
		"search_keyword", "TestData.json");
	SpaceCharacterSearchKeyword = (String) jsonObjectArray
		.get("search_keyword_value");
	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObject(
		"FeoSearchKeywordData", "SpecialCharacterSearchKeyword",
		"search_keyword", "TestData.json");
	SpecialCharacterSearchKeyword = (String) jsonObjectArray
		.get("search_keyword_value");

	ExperiencePreviewPDPPageSections = ((String) jsonObject
		.get("ExperiencePreviewPDPPageSections")).split(",");
	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObject(
		"ATCModalSuggestionProductId", "CertonaSingleSKU",
		"product_Type", "TestData.json");
	CertonaSingleSKU = (String) jsonObjectArray.get("product_Id");

	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObject(
		"ATCModalSuggestionProductId", "CertonaMultiSku",
		"product_Type", "TestData.json");
	CertonaMultiSku = (String) jsonObjectArray.get("product_Id");

	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObject(
		"ATCModalSuggestionProductId", "CertonaCollection",
		"product_Type", "TestData.json");
	CertonaCollection = (String) jsonObjectArray.get("product_Id");

	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObject(
		"ATCModalSuggestionProductId", "CertonaAccessory",
		"product_Type", "TestData.json");
	CertonaAccessory = (String) jsonObjectArray.get("product_Id");

	GiftCardNumber2Baby = ((String) jsonObject.get("GiftCardNumber2Baby"));
	GiftCardPin2Baby = ((String) jsonObject.get("GiftCardPin2Baby"));

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"ProductCollectionbaby", "prod_Type", "TestData.json");
	ProductCollectionbaby = (String) jsonObjectArray.get("ProductIDOrName");
	ProductAccessoryBaby = ((String) jsonObject.get("ProductAccessoryBaby"));
	ProductWithCustomerImage = ((String) jsonObject
		.get("ProductWithCustomerImage"));
	ProductWithCustomerImageBaby = ((String) jsonObject
		.get("ProductWithCustomerImageBaby"));
	UserContactEmailid = ((String) jsonObject.get("UserContactEmailid"));
	UserContactPhoneNumber = ((String) jsonObject
		.get("UserContactPhoneNumber"));

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"FeaturesSpecsSKUData_US", "prod_Type", "TestData.json");

	FeaturesSpecsSKUData_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"FeaturesSpecsSKUData_Baby", "prod_Type", "TestData.json");

	FeaturesSpecsSKUData_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"FeaturesSpecsMSKUData_US", "prod_Type", "TestData.json");

	FeaturesSpecsMSKUData_US = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"FeaturesSpecsMSKUData_Baby", "prod_Type", "TestData.json");

	FeaturesSpecsMSKUData_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");
	JSON_GiftMessageInputPayload = (String) jsonObject
		.get("JSON_GiftMessageInputPayload");
	;
	JSON_MissinggiftWrapMessage = (String) jsonObject
		.get("JSON_MissinggiftWrapMessage");
	;
	JSON_MissingcontainsGiftWrap = (String) jsonObject
		.get("JSON_MissingcontainsGiftWrap");
	;
	JSON_MissingContainsGiftWrapMessage = (String) jsonObject
		.get("JSON_MissingContainsGiftWrapMessage");
	;
	ExperiencePreviewPDPPageSectionsEverlivingSKU = ((String) jsonObject
		.get("ExperiencePreviewPDPPageSectionsEverlivingSKU"))
		.split(",");
	ExperiencePreviewPDPPageSectionsEverlivingGroup = ((String) jsonObject
		.get("ExperiencePreviewPDPPageSectionsEverlivingGroup"))
		.split(",");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"AddMultipleShippingToOrderData", "Valid", "data_desc",
		"TestData.json");
	ValidAddMultipleShippingToOrderData = jsonObjectArray.toJSONString();

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"AddMultipleShippingToOrderData", "Invalid", "data_desc",
		"TestData.json");
	InvalidAddMultipleShippingToOrderData = jsonObjectArray.toJSONString();

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"SaveCreditCardBillingAddressData", "valid", "data_desc",
		"TestData.json");
	ValidCreditCardBillingAddressData = jsonObjectArray.toJSONString();
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"SaveCreditCardBillingAddressData", "invalid", "data_desc",
		"TestData.json");
	InvalidCreditCardBillingAddressData = jsonObjectArray.toJSONString();

	CoRegFirstName = ((String) jsonObject.get("CoRegFirstName"));

	CoRegLastName = ((String) jsonObject.get("CoRegLastName"));

	EventDate = ((String) jsonObject.get("EventDate"));
	NumberofGuest = ((String) jsonObject.get("NumberofGuest"));
	NewUserpassword = ((String) jsonObject.get("NewUserpassword"));
	enhanceStoreValidJosn = ((String) jsonObject
		.get("EnhanceStoreValidJosnDetails"));
	enhanceStoreInvalidJosn = ((String) jsonObject
		.get("EnhanceStoreInvalidJsonDetails"));
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"AcessoryLeadLTL", "prod_Type", "TestData.json");
	AcessoryLeadLTL = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObjectByEnvHeader(
		"FEOEnvironmentURLs", "drupal", "env_desc", "TestData.json");
	DrupalUrl = (String) jsonObjectArray.get("url");

	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObjectByEnvHeader(
		"FEOEnvironmentURLs", "solr", "env_desc", "TestData.json");
	SOLRUrl = (String) jsonObjectArray.get("url");

	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObjectByEnvHeader(
		"FEOEnvironmentURLs", "cacheassembler", "env_desc",
		"TestData.json");
	cacheassemblerUrl = (String) jsonObjectArray.get("url");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"AcessoryChildLTL", "prod_Type", "TestData.json");
	AcessoryChildLTL = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"Katori_PY", "prod_Type", "TestData.json");
	Katori_PY = (String) jsonObjectArray.get("ProductIDOrName");
	ProductDetailAPI_ProductIdBaby = (String) jsonObject
		.get("ProductDetailAPI_ProductIdBaby");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"SkuDetailAPiSKU_DataBaby", "prod_Type", "TestData.json");
	SkuDetailAPiSKU_DataBaby = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"SkuDetailAPi_Product_DataBaby", "prod_Type", "TestData.json");
	SkuDetailAPi_Product_DataBaby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"Katori_PY_Baby", "prod_Type", "TestData.json");
	Katori_PY_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	EnterCutomizedText = ((String) jsonObject.get("EnterCutomizedText"));

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"Katori_PB", "prod_Type", "TestData.json");
	Katori_PB = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"Katori_PB_Baby", "prod_Type", "TestData.json");
	Katori_PB_Baby = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"Katori_CR", "prod_Type", "TestData.json");
	Katori_CR = (String) jsonObjectArray.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"Katori_CR_Baby", "prod_Type", "TestData.json");
	Katori_CR_Baby = (String) jsonObjectArray.get("ProductIDOrName");
	APIVersion_Flag = System.getProperty("APIVersion_Flag",
		(String) jsonObject.get("APIVersion_Flag"));
	APIVersionUrl = DataMgr.getValueByAPIVersion("TestData.json",
		"APIVersionUrlStatefull", "APIVersionUrlStatefullNot");
	;
	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObjectByEnvHeader(
		"FEOEnvironmentURLs", "ApplicationURL", "env_desc",
		"TestData.json");
	ApplicationURL = (String) jsonObjectArray.get("url");
	APIPaypalloginEmail = ((String) jsonObject.get("APIPaypalloginEmail"));
	APIPaypalloginPassword = ((String) jsonObject
		.get("APIPaypalloginPassword"));
	APIPaypalloginInternationlEmail = ((String) jsonObject
		.get("APIPaypalloginInternationlEmail"));
	APIPaypalloginInternationlPassword = ((String) jsonObject
		.get("APIPaypalloginInternationlPassword"));
	RegistryValidJsonResultString = (String) jsonObject
		.get("RegistryValidJsonResultString");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"Bopus_SingleSKU", "prod_Type", "TestData.json");
	Bopus_SingleSKU = (String) jsonObjectArray.get("ProductIDOrName");

	RegistryUserEmailPassword = (String) jsonObject
		.get("RegistryUserEmailPassword");

	RegistryUserEmail = (String) jsonObject.get("RegistryUserEmail");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"MultiSkuWithDropdownColorOptions_Baby", "prod_Type",
		"TestData.json");
	MultiSkuWithDropdownColorOptions_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr
		.fetchDataJsonArrayObject("FEOproductdata",
			"Accessories_with_Child_LTL_Baby", "prod_Type",
			"TestData.json");
	Accessories_with_Child_LTL_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"Accessories_with_Lead_LTL_Baby", "prod_Type", "TestData.json");
	Accessories_with_Lead_LTL_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"Multi_Sku_Color_Size_Baby", "prod_Type", "TestData.json");
	Multi_Sku_Color_Size_Baby = (String) jsonObjectArray
		.get("ProductIDOrName");
	jsonObjectArray = DataMgr.fetchDataJsonObjectArrayObject(
		"FeoSearchKeywordData", "KingKeyword", "search_keyword",
		"TestData.json");
	KingBeddingKeyword = (String) jsonObjectArray
		.get("search_keyword_value");
	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"outOfStockMultiSKUBaby", "prod_Type", "TestData.json");
	outOfStockMultiSKUBaby = (String) jsonObjectArray
		.get("ProductIDOrName");
	ValidBopusJsonResultString = (String) jsonObject
		.get("ValidBopusJsonResultString");
	Env_Flag = System.getProperty("Env_Flag",
		(String) jsonObject.get("Env_Flag"));
	prod_queryParam = DataMgr
		.getProdQueryParam("TestData.json", "Env_Flag");

	jsonObjectArray = DataMgr.fetchDataJsonArrayObject("FEOproductdata",
		"SDD_SingleSKU", "prod_Type", "TestData.json");
	SDD_SingleSKU = (String) jsonObjectArray.get("ProductIDOrName");

	CoRegEmailid = ((String) jsonObject.get("CoRegEmailid"));
    }

    @SuppressWarnings("rawtypes")
    public static void getEnvironmentData() throws FileNotFoundException,
	    IOException, ParseException {

	System.out.println("Fetching enviroment data...");

	JSONObject jsonObject = DataMgr.getJSONURL("Config.json");
	JSONObject innerObj = null;
	JSONObject outerObj = null;

	MyOffers_config = (String) jsonObject.get("MyOffers_config");
	System.out.println("MyOffers_config is" + MyOffers_config);

	SPC_Config = (String) jsonObject.get("SPC_config");
	System.out.println("SPC is: " + SPC_Config);

	atcModalConfig = (String) jsonObject.get("ATCModalConfig");
	System.out.println("Atc Modal Config: " + atcModalConfig);

	Device = System.getProperty("device");
	System.out.println("Device is: " + Device);
	Concept = System.getProperty("concept");
	System.out.println("Concept is: " + Concept);
	Browser = System.getProperty("browser");
	System.out.println("Browser is: " + Browser);
	Env = System.getProperty("env");
	System.out.println("Enviroment is: " + Env);

	JSONArray jsonArray = (JSONArray) jsonObject.get(Env);
	Iterator i = jsonArray.iterator();
	while (i.hasNext()) {
	    innerObj = (JSONObject) i.next();
	}

	outerObj = (JSONObject) innerObj.get("US");
	url_Site_US = (String) outerObj.get("SITE");
	System.out.println(url_Site_US);
	url_Api_US = (String) outerObj.get("API");
	System.out.println(url_Api_US);

	outerObj = (JSONObject) innerObj.get("BABY");
	url_Site_Baby = (String) outerObj.get("SITE");
	System.out.println(url_Site_Baby);
	url_Api_Baby = (String) outerObj.get("API");
	System.out.println(url_Api_Baby);

	outerObj = (JSONObject) innerObj.get("CA");
	url_Site_CA = (String) outerObj.get("SITE");
	System.out.println(url_Site_CA);
	url_Api_CA = (String) outerObj.get("API");
	System.out.println(url_Api_CA);

	outerObj = (JSONObject) innerObj.get("TBSUS");
	url_Site_US_TBS = (String) outerObj.get("SITE");
	System.out.println(url_Site_US_TBS);
	url_Api_US_TBS = (String) outerObj.get("API");
	System.out.println(url_Api_US_TBS);

	outerObj = (JSONObject) innerObj.get("TBSBABY");
	url_Site_Baby_TBS = (String) outerObj.get("SITE");
	System.out.println(url_Site_Baby_TBS);
	url_Api_Baby_TBS = (String) outerObj.get("API");
	System.out.println(url_Api_Baby_TBS);

	outerObj = (JSONObject) innerObj.get("TBSCA");
	url_Site_CA_TBS = (String) outerObj.get("SITE");
	System.out.println(url_Site_CA_TBS);
	url_Api_CA_TBS = (String) outerObj.get("API");
	System.out.println(url_Api_CA_TBS);

	if (Concept.equalsIgnoreCase("US")) {
	    urlSite = System.getProperty("SiteUrl", url_Site_US);
	    urlApi = System.getProperty("SiteApi", url_Api_US);

	} else if (Concept.equalsIgnoreCase("Baby")) {
	    urlSite = System.getProperty("SiteUrl", url_Site_Baby);
	    urlApi = System.getProperty("SiteApi", url_Site_Baby);
	} else if (Concept.equalsIgnoreCase("CA")) {
	    urlSite = url_Site_CA;
	    urlApi = url_Api_CA;
	} else if (Concept.equalsIgnoreCase("TBSUS")) {
	    urlSite = url_Site_US_TBS;
	    urlApi = url_Api_US_TBS;
	} else if (Concept.equalsIgnoreCase("TBSBaby")) {
	    urlSite = url_Site_Baby_TBS;
	    urlApi = url_Api_Baby_TBS;
	} else if (Concept.equalsIgnoreCase("TBSCA")) {
	    urlSite = url_Site_CA_TBS;
	    urlApi = url_Api_CA_TBS;
	} else {
	    throw new IllegalStateException("Incorrect Concept passed");
	}

	System.out.println(urlSite);
	System.out.println(urlApi);

    }

    public static String getProductID(String productType) throws Throwable {
	JSONObject jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"productdata", productType, "prod_Type", "TestData.json");
	String productId = (String) jsonObjectArray.get("ProductIDOrName");
	return productId;
    }

    public static String getCardNumber(String cardType) throws Throwable {
	JSONObject jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"creditcarddata", cardType, "CardSelector", "TestData.json");
	String cardNumber = (String) jsonObjectArray.get("CardNumber");
	return cardNumber;
    }

    public static String EditAddressBookFields(String productType)
	    throws Throwable {
	JSONObject jsonObjectArray = DataMgr.fetchDataJsonArrayObject(
		"productdata", productType, "prod_Type", "TestData.json");
	String productId = (String) jsonObjectArray.get("ProductIDOrName");
	return productId;
    }

    public static JSONObject validateEditAddressFieldsInAddressBook(
	    String dataToBeExtraed) throws Throwable {
	JSONObject Fields = DataMgr.fetchDataJsonArrayObjectFormFields(
		dataToBeExtraed, "TestData.json");
	return Fields;

    }

}
