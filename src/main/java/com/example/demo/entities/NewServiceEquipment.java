package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="new_service_equipment")
public class NewServiceEquipment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@NotNull
	private String equipmentSku;
	@NotNull
	private String expectedEquipmentPrice;
	private String accessorySku;
	private String expectedAccessoryPrice;
	@NotNull
	private String contractTerm;
	private String featureCode;
	@NotNull
	private String placCode;
	@NotNull
	private String zipCode;
	
	@NotNull
	private String paymentType;
	@NotNull
	private String creditCardNumber;
	@NotNull
	private String CID;
	@NotNull
	private String expiry;
	@NotNull
	private String paymentZipCode;
	
	@NotNull
	private String businessName;
	@NotNull
	private String shippingAttention;
	private String shippingAddress;
	@NotNull
	private String addressLineOne;
	private String addressLineTwo;
	@NotNull
	private String city;
	@NotNull
	private String state;
	@NotNull
	private String country;
	@NotNull
	private String ShipmentZipCode;
	@NotNull
	private String phone;
	@NotNull
	private String ecpdDefaultShipping;
	
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	private String ppuAddress;
	@NotNull
	private String ppuAddressLineOne;
	
	
	private String ppuAddressLineTwo;
	
	@NotNull
	private String ppuCity;
	
	@NotNull
	private String  ppuCountry;
	
	public NewServiceEquipment(Long id, @NotNull String equipmentSku, @NotNull String expectedEquipmentPrice,
			String accessorySku, String expectedAccessoryPrice, @NotNull String contractTerm, String featureCode,
			@NotNull String placCode, @NotNull String zipCode, @NotNull String paymentType,
			@NotNull String creditCardNumber, @NotNull String cID, @NotNull String expiry,
			@NotNull String paymentZipCode, @NotNull String businessName, @NotNull String shippingAttention,
			String shippingAddress, @NotNull String addressLineOne, String addressLineTwo, @NotNull String city,
			@NotNull String state, @NotNull String country, @NotNull String shipmentZipCode, @NotNull String phone,
			@NotNull String ecpdDefaultShipping, @NotNull String firstName, @NotNull String lastName, String ppuAddress,
			@NotNull String ppuAddressLineOne, String ppuAddressLineTwo, @NotNull String ppuCity,
			@NotNull String ppuCountry, @NotNull String ppuState, @NotNull String ppuPhone,
			@NotNull String ppuZipCode) {
		super();
		this.id = id;
		this.equipmentSku = equipmentSku;
		this.expectedEquipmentPrice = expectedEquipmentPrice;
		this.accessorySku = accessorySku;
		this.expectedAccessoryPrice = expectedAccessoryPrice;
		this.contractTerm = contractTerm;
		this.featureCode = featureCode;
		this.placCode = placCode;
		this.zipCode = zipCode;
		this.paymentType = paymentType;
		this.creditCardNumber = creditCardNumber;
		CID = cID;
		this.expiry = expiry;
		this.paymentZipCode = paymentZipCode;
		this.businessName = businessName;
		this.shippingAttention = shippingAttention;
		this.shippingAddress = shippingAddress;
		this.addressLineOne = addressLineOne;
		this.addressLineTwo = addressLineTwo;
		this.city = city;
		this.state = state;
		this.country = country;
		ShipmentZipCode = shipmentZipCode;
		this.phone = phone;
		this.ecpdDefaultShipping = ecpdDefaultShipping;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ppuAddress = ppuAddress;
		this.ppuAddressLineOne = ppuAddressLineOne;
		this.ppuAddressLineTwo = ppuAddressLineTwo;
		this.ppuCity = ppuCity;
		this.ppuCountry = ppuCountry;
		this.ppuState = ppuState;
		this.ppuPhone = ppuPhone;
		this.ppuZipCode = ppuZipCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEquipmentSku() {
		return equipmentSku;
	}

	public void setEquipmentSku(String equipmentSku) {
		this.equipmentSku = equipmentSku;
	}

	public String getExpectedEquipmentPrice() {
		return expectedEquipmentPrice;
	}

	public void setExpectedEquipmentPrice(String expectedEquipmentPrice) {
		this.expectedEquipmentPrice = expectedEquipmentPrice;
	}

	public String getAccessorySku() {
		return accessorySku;
	}

	public void setAccessorySku(String accessorySku) {
		this.accessorySku = accessorySku;
	}

	public String getExpectedAccessoryPrice() {
		return expectedAccessoryPrice;
	}

	public void setExpectedAccessoryPrice(String expectedAccessoryPrice) {
		this.expectedAccessoryPrice = expectedAccessoryPrice;
	}

	public String getContractTerm() {
		return contractTerm;
	}

	public void setContractTerm(String contractTerm) {
		this.contractTerm = contractTerm;
	}

	public String getFeatureCode() {
		return featureCode;
	}

	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
	}

	public String getPlacCode() {
		return placCode;
	}

	public void setPlacCode(String placCode) {
		this.placCode = placCode;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getCID() {
		return CID;
	}

	public void setCID(String cID) {
		CID = cID;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getPaymentZipCode() {
		return paymentZipCode;
	}

	public void setPaymentZipCode(String paymentZipCode) {
		this.paymentZipCode = paymentZipCode;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getShippingAttention() {
		return shippingAttention;
	}

	public void setShippingAttention(String shippingAttention) {
		this.shippingAttention = shippingAttention;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getShipmentZipCode() {
		return ShipmentZipCode;
	}

	public void setShipmentZipCode(String shipmentZipCode) {
		ShipmentZipCode = shipmentZipCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEcpdDefaultShipping() {
		return ecpdDefaultShipping;
	}

	public void setEcpdDefaultShipping(String ecpdDefaultShipping) {
		this.ecpdDefaultShipping = ecpdDefaultShipping;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPpuAddress() {
		return ppuAddress;
	}

	public void setPpuAddress(String ppuAddress) {
		this.ppuAddress = ppuAddress;
	}

	public String getPpuAddressLineOne() {
		return ppuAddressLineOne;
	}

	public void setPpuAddressLineOne(String ppuAddressLineOne) {
		this.ppuAddressLineOne = ppuAddressLineOne;
	}

	public String getPpuAddressLineTwo() {
		return ppuAddressLineTwo;
	}

	public void setPpuAddressLineTwo(String ppuAddressLineTwo) {
		this.ppuAddressLineTwo = ppuAddressLineTwo;
	}

	public String getPpuCity() {
		return ppuCity;
	}

	public void setPpuCity(String ppuCity) {
		this.ppuCity = ppuCity;
	}

	public String getPpuCountry() {
		return ppuCountry;
	}

	public void setPpuCountry(String ppuCountry) {
		this.ppuCountry = ppuCountry;
	}

	public String getPpuState() {
		return ppuState;
	}

	public void setPpuState(String ppuState) {
		this.ppuState = ppuState;
	}

	public String getPpuPhone() {
		return ppuPhone;
	}

	public void setPpuPhone(String ppuPhone) {
		this.ppuPhone = ppuPhone;
	}

	public String getPpuZipCode() {
		return ppuZipCode;
	}

	public void setPpuZipCode(String ppuZipCode) {
		this.ppuZipCode = ppuZipCode;
	}

	@NotNull
	private String  ppuState;
	
	@NotNull
	private String ppuPhone;
	
	@NotNull
	private String ppuZipCode;
	
	
	
	

}
