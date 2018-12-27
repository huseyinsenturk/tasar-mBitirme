package com.springjpa.label;

public enum GirdiAlanlari {

    SHIPMENTS("MHP_STRUKTUR"),
    KOLTUK_NO("KOLTUK_NO"),
    SHIPMENT("SHIPMENT"),
    SHIPMENT_DETAILS("SHIPMENT_DETAILS"),
    PACKAGE("PACKAGE"),
    PACKAGE_DETAILS("PACKAGE_DETAILS"),
    PACKAGE_HEADER("PACKAGE_HEADER"),
    PRODCODE("SEND_2N_PRODCODE"),
    WEIGHT("SEND_GEWICHTEINZEL"),
    FRANKING("SEND_FRANKATURKZ"),
    SUBTOTAL("SEND_WARENWERT"),
    CURRENCY("SEND_NACHNAHMEWAEHRUNG"),
    CUSTOM_SHORT_TEXT("ZOLL_INHALTKURZB"),
    PKG_NUMBER("SEND_NR"),
    SHIPMENT_HEADER("SHIPMENT_HEADER"),
    SENDER_ADDR_01("ABS_ADR_01"),
    SENDER_ADDR_02("ABS_ADR_02"),
    SENDER_STREET("ABS_STRASSE"),
    SENDER_ZIP_CODE("ABS_PLZ"),
    SENDER_CITY("ABS_ORT"),
    SENDER_COUNTRY("ABS_LAND"),
    RECIPIENT_ADDR_01("EMPF_ADR_01"),
    RECIPIENT_ADDR_02("EMPF_ADR_02"),
    RECIPIENT_ADDR_03("EMPF_ADR_03"),
    RECIPIENT_COUNTRY_ISO("EMPF_ISO"),
    RECIPIENT_COUNTRY_SHORT("EMPF_LAND_KURZ"),
    RECIPIENT_CITY("EMPF_ORT"),
    RECIPIENT_ZIP_CODE("EMPF_PLZ"),
    RECIPIENT_STREET("EMPF_STRASSE"),
    RECIPIENT_PHONE("EMPF_TEL"),
    PKG_WIDTH("SEND_BREITE"),
    PKG_HEIGHT("SEND_HOEHE"),
    PKG_LENGTH("SEND_LAENGE"),
    CARRIER("FRACHTFUEHRER"),
    PKG_PACKAGES_COUNT("SEND_ANZ"),
    SEND_CLIENT("SEND_MANDANT"),
    SEND_REFERENCE_01("SEND_REFERENZNR_01"),
    SEND_REFERENCE_02("SEND_REFERENZNR_02"),
    ACTIVE_PRINTER_NUMBER("INT_AKTPRINTER"),
    COD_AMOUNT("SEND_NACHNAHMEBETRAG"),
    COD_CURRENCY("SEND_NACHNAHMEWAEHRUNG"),

    /* Other carriers specific fields */
    GOODS_DESCRIPTION("WAREN_BESCHREIBUNG"),
    SERVICE("SERVICE"),
    PARCEL_PRICE("PARCEL_PRICE"),
    SERVICE_ADDITIONAL_INFO("SERVICE_ADDITIONAL_INFO"),
    GESCHLECHT("GESCHLECHT"),
    /* DPD Specific Fields */
    TEMPLATE("TEMPLATE"),
    NO_OF_PARCELS("NO_OF_PARCELS");

    private String alternativeName;

    GirdiAlanlari(String alternativeName) {
        this.alternativeName = alternativeName;
    }

    public String getAlternativeName() {
        return alternativeName;
    }
}