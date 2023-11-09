package hus.oop.lab8._4._4_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();
        System.out.println("Original data:");
        testOriginalData();
        System.out.println();

        System.out.println("Oceania country:");
        testFilterOceaniaCountry();
        System.out.println();

        System.out.println("Asia country: ");
        testFilterAsiaCountry();
        System.out.println();

        System.out.println("Europe country: ");
        testFilterEuropeCountry();
        System.out.println();

        System.out.println("Africa country:");
        testFilterAfricaCountry();
        System.out.println();

        System.out.println("North America country:");
        testFilterNorthAmericaCountry();
        System.out.println();

        System.out.println("South America country:");
        testFilterSouthAmericaCountry();
        System.out.println();

        System.out.println("Sort increasing by population:");
        testSortIncreasingByPopulation();
        System.out.println();

        System.out.println("Sort decreasing by population:");
        testSortDecreasingByPopulation();
        System.out.println();

        System.out.println("Sort increasing by area:");
        testSortIncreasingByArea();
        System.out.println();

        System.out.println("Sort decreasing by area:");
        testSortDecreasingByArea();
        System.out.println();

        System.out.println("Sort increasing by gdp:");
        testSortIncreasingByGdp();
        System.out.println();

        System.out.println("Sort decreasing by gdp:");
        testSortDecreasingByGdp();
        System.out.println();

        System.out.println("4 most populous countries:");
        testFilterMostPopulousCountries();
        System.out.println();

        System.out.println("4 least populous countries:");
        testFilterLeastPopulousCountries();
        System.out.println();

        System.out.println("4 largest countries:");
        testFilterLargestAreaCountries();
        System.out.println();

        System.out.println("4 smallest countries:");
        testFilterSmallestAreaCountries();
        System.out.println();

        System.out.println("4 highest gdp countries:");
        testFilterHighestGdpCountries();
        System.out.println();

        System.out.println("4 lowest gdp countries:");
        testFilterLowestGdpCountries();
        System.out.println();
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String continent = dataList.get(5);

                Country country = null;
                switch (continent) {
                    case "Asia":
                        country = new AsiaCountry(code, name, population, area, gdp);
                        break;
                    case "Europe":
                        country = new EuropeCountry(code, name, population, area, gdp);
                        break;
                    case "Africa":
                        country = new AfricaCountry(code, name, population, area, gdp);
                        break;
                    case "Oceania":
                        country = new OceaniaCountry(code, name, population, area, gdp);
                        break;
                    case "North America":
                        country = new NorthAmericaCountry(code, name, population, area, gdp);
                        break;
                    case "South America":
                        country = new SouthAmericaCountry(code, name, population, area, gdp);
                        break;
                }

                countryManager.append(country);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "src/data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.println(codesString);
        System.out.println("There are " + countryManager.getLength() + " countries.");
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        System.out.println(countries.length + " countries.");
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);

        System.out.println(codeString);
        System.out.println(countries.length + " countries.");
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        System.out.println(countries.length + " countries.");
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        System.out.println(countries.length + " countries.");
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        System.out.println(countries.length + " countries.");
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        System.out.println(countries.length + " countries.");
    }

    public static void testFilterAfricaCountry() {
        Country[] countries = countryManager.filterAfricaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        System.out.println(countries.length + " countries.");
    }

    public static void testFilterAsiaCountry() {
        Country[] countries = countryManager.filterAsiaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        System.out.println(countries.length + " countries.");
    }

    public static void testFilterEuropeCountry() {
        Country[] countries = countryManager.filterEuropeCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        System.out.println(countries.length + " countries.");
    }

    public static void testFilterNorthAmericaCountry() {
        Country[] countries = countryManager.filterNorthAmericaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        System.out.println(countries.length + " countries.");
    }

    public static void testFilterOceaniaCountry() {
        Country[] countries = countryManager.filterOceaniaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        System.out.println(countries.length + " countries.");
    }

    public static void testFilterSouthAmericaCountry() {
        Country[] countries = countryManager.filterSouthAmericaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        System.out.println(countries.length + " countries.");
    }

    public static void testFilterMostPopulousCountries() {
        Country[] countries = countryManager.filterMostPopulousCountries(4);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        System.out.println(countries.length + " countries.");
    }

    public static void testFilterLeastPopulousCountries() {
        Country[] countries = countryManager.filterLeastPopulousCountries(4);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        System.out.println(countries.length + " countries.");
    }

    public static void testFilterLargestAreaCountries() {
        Country[] countries = countryManager.filterLargestAreaCountries(4);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        System.out.println(countries.length + " countries.");
    }

    public static void testFilterSmallestAreaCountries() {
        Country[] countries = countryManager.filterSmallestAreaCountries(4);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        System.out.println(countries.length + " countries.");
    }

    public static void testFilterHighestGdpCountries() {
        Country[] countries = countryManager.filterHighestGdpCountries(4);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        System.out.println(countries.length + " countries.");
    }

    public static void testFilterLowestGdpCountries() {
        Country[] countries = countryManager.filterLowestGdpCountries(4);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        System.out.println(countries.length + " countries.");
    }
}
