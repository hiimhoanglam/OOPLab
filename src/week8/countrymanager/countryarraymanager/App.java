package week8.countrymanager.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();

        // Test sorting countries by increasing population
        System.out.println("Testing sorting countries by increasing population:");
        testSortIncreasingByPopulation();
        System.out.println();

        // Test sorting countries by decreasing population
        System.out.println("Testing sorting countries by decreasing population:");
        testSortDecreasingByPopulation();
        System.out.println();

        // Test sorting countries by increasing area
        System.out.println("Testing sorting countries by increasing area:");
        testSortIncreasingByArea();
        System.out.println();

        // Test sorting countries by decreasing area
        System.out.println("Testing sorting countries by decreasing area:");
        testSortDecreasingByArea();
        System.out.println();

        // Test sorting countries by increasing GDP
        System.out.println("Testing sorting countries by increasing GDP:");
        testSortIncreasingByGdp();
        System.out.println();

        // Test sorting countries by decreasing GDP
        System.out.println("Testing sorting countries by decreasing GDP:");
        testSortDecreasingByGdp();
        System.out.println();

        // Test filtering Africa countries
        System.out.println("Testing filtering Africa countries:");
        testFilterAfricaCountry();
        System.out.println();

        // Test filtering Asia countries
        System.out.println("Testing filtering Asia countries:");
        testFilterAsiaCountry();
        System.out.println();

        // Test filtering Europe countries
        System.out.println("Testing filtering Europe countries:");
        testFilterEuropeCountry();
        System.out.println();

        // Test filtering North America countries
        System.out.println("Testing filtering North America countries:");
        testFilterNorthAmericaCountry();
        System.out.println();

        // Test filtering Oceania countries
        System.out.println("Testing filtering Oceania countries:");
        testFilterOceaniaCountry();
        System.out.println();

        // Test filtering South America countries
        System.out.println("Testing filtering South America countries:");
        testFilterSouthAmericaCountry();
        System.out.println();

        // Test filtering most populous countries
        System.out.println("Testing filtering most populous countries:");
        testFilterMostPopulousCountries();
        System.out.println();

        // Test filtering least populous countries
        System.out.println("Testing filtering least populous countries:");
        testFilterLeastPopulousCountries();
        System.out.println();

        // Test filtering largest area countries
        System.out.println("Testing filtering largest area countries:");
        testFilterLargestAreaCountries();
        System.out.println();

        // Test filtering smallest area countries
        System.out.println("Testing filtering smallest area countries:");
        testFilterSmallestAreaCountries();
        System.out.println();

        // Test filtering highest GDP countries
        System.out.println("Testing filtering highest GDP countries:");
        testFilterHighestGdpCountries();
        System.out.println();

        // Test filtering lowest GDP countries
        System.out.println("Testing filtering lowest GDP countries:");
        testFilterLowestGdpCountries();
        System.out.println();
    }

    public static void readListData(String filePath) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }
                Country country;
                if (dataList.get(5).equals("Oceania")) {
                    country = new OceaniaCountry(
                            dataList.get(0),
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                }
                else if (dataList.get(5).equals("Africa")) {
                    country = new AfricaCountry(
                            dataList.get(0),
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                }
                else if (dataList.get(5).equals("South America")) {
                    country = new SouthAmericaCountry(
                            dataList.get(0),
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                }
                else if (dataList.get(5).equals("Asia")) {
                    country = new AsiaCountry(
                            dataList.get(0),
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                }
                else if (dataList.get(5).equals("North America")) {
                    country = new NorthAmericaCountry(
                            dataList.get(0),
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                }
                else if (dataList.get(5).equals("Europe")) {
                    country = new EuropeCountry(
                            dataList.get(0),
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                }
                else {
                    country = null;
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
        String filePath = "D:\\OOP2\\src\\week8\\countrymanager\\data\\countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortIncreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortIncreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterAfricaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterAfricaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterAsiaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterAsiaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterEuropeCountry() {
        /* TODO */
        Country[] countries = countryManager.filterEuropeCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterNorthAmericaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterNorthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterOceaniaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterOceaniaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterSouthAmericaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterSouthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterMostPopulousCountries() {
        /* TODO */
        Country[] countries = countryManager.filterMostPopulousCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterLeastPopulousCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLeastPopulousCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterLargestAreaCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLargestAreaCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterSmallestAreaCountries() {
        /* TODO */
        Country[] countries = countryManager.filterSmallestAreaCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterHighestGdpCountries() {
        /* TODO */
        Country[] countries = countryManager.filterHighestGdpCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterLowestGdpCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLowestGdpCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }
}
