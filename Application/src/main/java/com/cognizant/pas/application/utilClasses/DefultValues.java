package com.cognizant.pas.application.utilClasses;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

// DefultValues class will contain all the values in the master tables
// used in drop down list in UI
public class DefultValues {
	
	private List<String> businessCategory = List.of("Retailer","Health Practitioner","Distributor","Food Service","Supplier","Manufacturer","Business Services","Investor");
	private List<String> businessType = List.of("E-tailer","Independent Grocer","Home and Textile","Pharmacy","Mass Merchandiser","Medical Professional","Health Club","Wholesaler of Finished Products","Full Service Restaurant","Corporate Dining","Coffee House","Private Chef","Equipment Supplier","Ingredient Importer","Food","Pharmaceuticals","Cosmetics","Beverage","Pet Products","Consultant","Government Agency","Publisher","Financial Institution","Private Equity Fund","Corporate Investor","Hedge Fund");
	
	private List<String> insuranceType = List.of("Pay Back","Fire","Replacement","Burglary","All Risks","Natural Disaster");
	
	private List<String> buildingType = List.of("Owner","Rented");
	
	private List<String> propertyType = List.of("Building","Factory Equipment","Property in Transit");
	
	private List<String> policyId = List.of("P01","P02","P03","P04","P05","P06","P07","P08","P09","P10","P11","P12","P13","P14","P15","P16","P17","P18","P19","P20","P21","P22","P23","P24","P25","P26","P27","P28","P29","P30","P31","P32","P33","P34","P35");
	
}
