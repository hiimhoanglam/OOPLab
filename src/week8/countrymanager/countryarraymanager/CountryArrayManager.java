package week8.countrymanager.countryarraymanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < this.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < this.length; j++) {
                if (newArray[minIndex].getPopulation() > newArray[j].getPopulation()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Country temp = newArray[minIndex];
                newArray[minIndex] = newArray[i];
                newArray[i] = temp;

            }

        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     *  using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < this.length - 1; i++) {
            boolean swap = false;
            int maxIndex = i;
            for (int j = i+1; j < this.length; j++) {
                if (newArray[maxIndex].getPopulation() < newArray[j].getPopulation()) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                Country temp = newArray[maxIndex];
                newArray[maxIndex] = newArray[i];
                newArray[i] = temp;
                swap = true;
            }
            if (!swap) {
                break;
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        boolean swap;
        for (int i = 0; i < this.length - 1; i++) {
            swap = false;
            for (int j = 0; j < this.length - i - 1; j++) {
                if (Double.compare(newArray[j].getArea(), newArray[j+1].getArea()) > 0) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j+1];
                    newArray[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        boolean swap;
        for (int i = 0; i < this.length - 1; i++) {
            swap = false;
            for (int j = 0; j < this.length - i - 1; j++) {
                if (Double.compare(newArray[j].getArea(), newArray[j+1].getArea()) < 0) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j+1];
                    newArray[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     *  using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 1; i < this.length; i++){
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && Double.compare(newArray[j].getGdp(), key.getGdp()) > 0) {
                newArray[j+1] = newArray[j];
                j--;
            }
            newArray[j+1] = key;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     *  sing insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        /* TODO */
        for (int i = 1; i < this.length; i++){
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && Double.compare(newArray[j].getGdp(), key.getGdp()) < 0) {
                newArray[j+1] = newArray[j];
                j--;
            }
            newArray[j+1] = key;
        }


        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        /* TODO */
        List<AfricaCountry> africaCountries = new ArrayList<>();
        for (Country country: countries) {
            if (country instanceof AfricaCountry) {
                africaCountries.add((AfricaCountry) country);
            }
        }
        AfricaCountry[] result = new AfricaCountry[africaCountries.size()];
        for (int i = 0; i < africaCountries.size(); i++) {
            result[i] = africaCountries.get(i);
        }
        return result;
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        List<AsiaCountry> asiaCountries = new ArrayList<>();
        for (Country country: countries) {
            if (country instanceof AsiaCountry) {
                asiaCountries.add((AsiaCountry) country);
            }
        }
        AsiaCountry[] result = new AsiaCountry[asiaCountries.size()];
        for (int i = 0; i < asiaCountries.size(); i++) {
            result[i] = asiaCountries.get(i);
        }
        return result;

    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        List<EuropeCountry> europeCountries = new ArrayList<>();
        for (Country country: countries) {
            if (country instanceof EuropeCountry) {
                europeCountries.add((EuropeCountry) country);
            }
        }
        EuropeCountry[] result = new EuropeCountry[europeCountries.size()];
        for (int i = 0; i < europeCountries.size(); i++) {
            result[i] = europeCountries.get(i);
        }
        return result;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        /* TODO */
        List<NorthAmericaCountry> northAmericaCountries = new ArrayList<>();
        for (Country country: countries) {
            if (country instanceof NorthAmericaCountry) {
                northAmericaCountries.add((NorthAmericaCountry) country);
            }
        }
        NorthAmericaCountry[] result = new NorthAmericaCountry[northAmericaCountries.size()];
        for (int i = 0; i < northAmericaCountries.size(); i++) {
            result[i] = northAmericaCountries.get(i);
        }
        return result;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        /* TODO */
        List<OceaniaCountry> oceaniaCountries = new ArrayList<>();
        for (Country country: countries) {
            if (country instanceof OceaniaCountry) {
                oceaniaCountries.add((OceaniaCountry) country);
            }
        }
        OceaniaCountry[] result = new OceaniaCountry[oceaniaCountries.size()];
        for (int i = 0; i < oceaniaCountries.size(); i++) {
            result[i] = oceaniaCountries.get(i);
        }
        return result;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        /* TODO */
        List<SouthAmericaCountry> southAmericaCountries = new ArrayList<>();
        for (Country country: countries) {
            if (country instanceof SouthAmericaCountry) {
                southAmericaCountries.add((SouthAmericaCountry) country);
            }
        }
        SouthAmericaCountry[] result = new SouthAmericaCountry[southAmericaCountries.size()];
        for (int i = 0; i < southAmericaCountries.size(); i++) {
            result[i] = southAmericaCountries.get(i);
        }
        return result;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        Country[] sortedPopulation = sortByDecreasingPopulation();
        Country[] result = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = sortedPopulation[i];
        }
        return result;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        Country[] sortedPopulation = sortByIncreasingPopulation();
        Country[] result = new Country[howMany];
        System.arraycopy(sortedPopulation, 0, result, 0, howMany);
        return result;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        Country[] sortedArea = sortByDecreasingArea();
        Country[] result = new Country[howMany];
        System.arraycopy(sortedArea, 0, result, 0, howMany);
        return result;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        Country[] sortedArea = sortByIncreasingArea();
        Country[] result = new Country[howMany];
        System.arraycopy(sortedArea, 0, result, 0, howMany);
        return result;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        Country[] sortedGDP = sortByDecreasingGdp();
        Country[] result = new Country[howMany];
        System.arraycopy(sortedGDP, 0, result, 0, howMany);
        return result;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        Country[] sortedGDP = sortByIncreasingGdp();
        Country[] result = new Country[howMany];
        System.arraycopy(sortedGDP, 0, result, 0, howMany);
        return result;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
