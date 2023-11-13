package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager {

    public void saveContract(Contract contract) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("contracts.csv", true))) {
            String type = contract.getClass().getSimpleName().toUpperCase();

            writer.write(String.format("%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s", type, contract.getDate(), contract.getName(),
                    contract.getCustomerEmail(), contract.getVehicle().getVin(), contract.getVehicle().getYear(), contract.getVehicle().getMake(),
                    contract.getVehicle().getModel(), contract.getVehicle().getVehicleType(), contract.getVehicle().getColor(),
                    contract.getVehicle().getOdometer(), contract.getVehicle().getPrice()));

            //Lease instance of
            if (contract instanceof LeaseContract) {
                writer.newLine();
                writer.write(String.format("%s|%s|%s|%s|%s", "LEASE", ((LeaseContract) contract).getExpectedEndingValue(),
                        ((LeaseContract) contract).getLeaseFee(), contract.getTotalPrice(), (contract).getMonthlyPayment()));
                writer.newLine();

                //Sales instance
            } else if (contract instanceof SalesContract) {
                writer.newLine();
                writer.write(String.format("%s|%s|%s|%s|%s", "SALE", ((SalesContract) contract).getSalesTax(), ((SalesContract) contract).getRecordingFee(),
                        ((SalesContract) contract).getProcessingFee(), ((SalesContract) contract).getTotalPrice(), ((SalesContract) contract).getMonthlyPayment()));
                writer.newLine();
            }


        } catch(IOException e){
                e.printStackTrace();
            }
        }

    }


