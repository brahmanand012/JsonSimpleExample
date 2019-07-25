package utility;

import com.example.Address;
import com.example.JsonManipulation;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.ObjectUtils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JsonOperation {

    public static void main(String args[])
    {
       JsonOperation jsonOper=new JsonOperation();

       //1. Calling Json Read Function to read json file
        System.out.println("---1.Calling Json Read Function to read json file----\n ");
       jsonOper.readJsonFile("Seller-Json.json");

       //2. Print the value of addressLine1
        System.out.println("---2.Print the value of addressLine1----\n ");
        jsonOper.readAddressLine1("Seller-Json.json");

        //3. Read all Phone Numbers
        System.out.println("---3.Read all Phone Numbers----\n ");
        jsonOper.readAllPhoneNumbers("Seller-Json.json");

        //4. Print total jurisdiction count
        System.out.println("---4. Print total jurisdiction count----\n ");
        jsonOper.getTotalJurisdictionCount("Seller-Json.json");

        //5.  Print all -> jurisdiction value along with its isVISACountries, ecl, importRegime count and taxoffice name value
        System.out.println("---5. Print all -> jurisdiction value along with its isVISACountries, ecl, importRegime count and taxoffice name value----\n ");
        jsonOper.readJurisdictionInfo("Seller-Json.json");

        //6. Replace visaRegistrationDate for all jurisdiction as today’s date in the same file. No need to create a new file.
        System.out.println("---6. Replace visaRegistrationDate for all jurisdiction as today’s date in the same file. No need to create a new file.----\n ");
        jsonOper.replaceVisaRegistrationDate("Seller-Json.json");

        //7. Check if file name is having hybrid word or not and print the message accordingly.
        System.out.println("---7. Check if file name is having hybrid word or not and print the message accordingly.----\n ");
        jsonOper.iSHybridExistsInJsonFileNameInCurrentDirectory();

        //8. Reduce registrationDate by 1 month. Same as above, it should happen in the same file.
        System.out.println("---8. Reduce registrationDate by 1 month. Same as above, it should happen in the same file.----\n ");
        jsonOper.reduceVisaRegistrationDateByOneMonth("Seller-Json.json");

        //9. Print Amazon Seller key
        System.out.println("---9. Print Amazon Seller key----\n ");
        jsonOper.readAmazonSellerKey("Seller-Json.json");
    }

    //1. Read Json File
    public void readJsonFile(String fileName)
    {
        JsonManipulation jsonManipulation=ObjectMapperUtils.readValue(fileName,JsonManipulation.class);
        System.out.println("@@@@ Json Contents --- \n  "+jsonManipulation.toString());
    }

    //2. Read Json File AddressLine1
    public void readAddressLine1(String fileName)
    {
        JsonManipulation jsonManipulation=ObjectMapperUtils.readValue(fileName,JsonManipulation.class);
        System.out.println("@@@@ Address Line1 --- \n  "+jsonManipulation.getContact().getAddress().getAddressLine1().toString());
    }

    //3. Print value of all phone numbers
    public void readAllPhoneNumbers(String fileName)
    {
        JsonManipulation jsonManipulation=ObjectMapperUtils.readValue(fileName,JsonManipulation.class);
        System.out.println("@@@@ All Phone Numbers --- \n  "+jsonManipulation.getContact().getPhoneNumbers().toString());
    }

    //4. Print total jurisdiction count
    public void getTotalJurisdictionCount(String fileName)
    {
        JsonManipulation jsonManipulation=ObjectMapperUtils.readValue(fileName,JsonManipulation.class);
        System.out.println("@@@@ Total jurisdiction count --- \n "+jsonManipulation.getRegistrations().getJurisdictionISOCode().getJurisdictionData().size());
    }

    //5. Print all -> jurisdiction value along with its isVISACountries, ecl, importRegime count and taxoffice name value
    public void readJurisdictionInfo(String fileName)
    {
        JsonManipulation jsonManipulation=ObjectMapperUtils.readValue(fileName,JsonManipulation.class);
        for(int i=0;i<jsonManipulation.getRegistrations().getJurisdictionISOCode().getJurisdictionData().size();i++)
        {
            System.out.println("@@@@ Jurisdiction Name --- \n "+jsonManipulation.getRegistrations().getJurisdictionISOCode().getJurisdictionData().get(i).getJurisdiction().toString());
            System.out.println("@@@@ iSVisaCountries --- \n "+jsonManipulation.getRegistrations().getJurisdictionISOCode().getJurisdictionData().get(i).getIsVISACountries().toString());
            System.out.println("@@@@ Ecl --- \n"+jsonManipulation.getRegistrations().getJurisdictionISOCode().getJurisdictionData().get(i).getFilingFrequencies().getEcl().toString());
            System.out.println("@@@@ ImportRegime Count --- \n "+jsonManipulation.getRegistrations().getJurisdictionISOCode().getJurisdictionData().get(i).getImportRegime().size());
            if(jsonManipulation.getRegistrations().getJurisdictionISOCode().getJurisdictionData().get(i).getTaxOffice()!=null)
            System.out.println("@@@@ Tax Office Name --- \n  "+jsonManipulation.getRegistrations().getJurisdictionISOCode().getJurisdictionData().get(i).getTaxOffice().getName());

        }
    }

    //6. Replace visaRegistrationDate for all jurisdiction as today’s date in the same file. No need to create a new file.
    public void replaceVisaRegistrationDate(String fileName)
    {
        Date date = new Date();
        String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
        JsonManipulation jsonManipulation=ObjectMapperUtils.readValue(fileName,JsonManipulation.class);
        for(int i=0;i<jsonManipulation.getRegistrations().getJurisdictionISOCode().getJurisdictionData().size();i++)
        {
            jsonManipulation.getRegistrations().getJurisdictionISOCode().getJurisdictionData().get(i).setVisaRegistrationDate(modifiedDate);
            ObjectMapperUtils.writeValueInFile(jsonManipulation,fileName);
        }
        System.out.println("@@@File Contents after replacing visaRegistrationDate for all jurisdiction as today’s date in the same file. No need to create a new file.----\n");
        readJsonFile(fileName);
    }

    //7. Check if file name is having hybrid word or not and print the message accordingly.
    public void iSHybridExistsInJsonFileNameInCurrentDirectory()
    {
        String path = System.getProperty("user.dir");
        File directory = new File(path);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            if(file.getName().contains(".json"))
                if(file.getName().contains("hybrid"))
                {
                    System.out.println("FIle Name contains hybrid");
                }
                else
                {
                    System.out.println("FIle Name does not contain hybrid");
                }

        }
    }

    //8. Reduce registrationDate by 1 month. Same as above, it should happen in the same file.
    public void reduceVisaRegistrationDateByOneMonth(String fileName)
    {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -1);
        Date date = cal.getTime();
        String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
        JsonManipulation jsonManipulation=ObjectMapperUtils.readValue(fileName,JsonManipulation.class);
        for(int i=0;i<jsonManipulation.getRegistrations().getJurisdictionISOCode().getJurisdictionData().size();i++)
        {
            jsonManipulation.getRegistrations().getJurisdictionISOCode().getJurisdictionData().get(i).setVisaRegistrationDate(modifiedDate);
            ObjectMapperUtils.writeValueInFile(jsonManipulation,fileName);
        }
        System.out.println("@@@File Contents after reducing registrationDate by 1 month , it should happen in the same file.----\n");
        readJsonFile(fileName);
    }

    //9. Print Amazon Seller key
    public void readAmazonSellerKey(String fileName)
    {
        JsonManipulation jsonManipulation=ObjectMapperUtils.readValue(fileName,JsonManipulation.class);
        System.out.println("@@@ AMazon Seller Key --- \n  "+jsonManipulation.getAmazonSellerKey().toString());
    }
}
