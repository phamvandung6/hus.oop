package hus.oop.lab8._4._4_3;

import java.util.Arrays;

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
            this.countries[i] = this.countries[i - 1];
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
     * using selection sort algorithm.
     * 
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[minIndex].getPopulation()) {
                    minIndex = j;
                }
            }

            Country temp = newArray[i];
            newArray[i] = newArray[minIndex];
            newArray[minIndex] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     * 
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() > newArray[maxIndex].getPopulation()) {
                    maxIndex = j;
                }
            }

            Country temp = newArray[i];
            newArray[i] = newArray[maxIndex];
            newArray[maxIndex] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     * 
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() > newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     * 
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() < newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     * 
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length; i++) {
            Country currentCountry = newArray[i];
            int j = i - 1;

            while (j > 0 && newArray[j].getGdp() > currentCountry.getGdp()) {
                newArray[j + 1] = newArray[j];
                j--;
            }

            newArray[j + 1] = currentCountry;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * sing insertion sort algorithm.
     * 
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; i++) {
            Country currentCountry = newArray[i];
            int j = i - 1;

            while (j >= 0 && newArray[j].getGdp() < currentCountry.getGdp()) {
                newArray[j + 1] = newArray[j];
                j--;
            }

            newArray[j + 1] = currentCountry;
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        AfricaCountry[] africaCountries = new AfricaCountry[length];
        int count = 0;
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                africaCountries[count++] = (AfricaCountry) country;
            }
        }
        return Arrays.copyOf(africaCountries, count);
    }

    public AsiaCountry[] filterAsiaCountry() {
        AsiaCountry[] asiaCountries = new AsiaCountry[length];
        int count = 0;

        for (Country country : countries) {
            if (country instanceof AsiaCountry) {
                asiaCountries[count++] = (AsiaCountry) country;
            }
        }

        return Arrays.copyOf(asiaCountries, count);
    }

    public EuropeCountry[] filterEuropeCountry() {
        EuropeCountry[] europeCountries = new EuropeCountry[length];
        int count = 0;

        for (Country country : countries) {
            if (country instanceof EuropeCountry) {
                europeCountries[count++] = (EuropeCountry) country;
            }
        }

        return Arrays.copyOf(europeCountries, count);
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        NorthAmericaCountry[] northAmericaCountries = new NorthAmericaCountry[length];
        int count = 0;

        for (Country country : countries) {
            if (country instanceof NorthAmericaCountry) {
                northAmericaCountries[count++] = (NorthAmericaCountry) country;
            }
        }

        return Arrays.copyOf(northAmericaCountries, count);
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        OceaniaCountry[] oceania = new OceaniaCountry[length];
        int count = 0;

        for (Country country : countries) {
            if (country instanceof OceaniaCountry) {
                oceania[count++] = (OceaniaCountry) country;
            }
        }

        return Arrays.copyOf(oceania, count);
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        SouthAmericaCountry[] southAmericaCountries = new SouthAmericaCountry[length];
        int count = 0;

        for (Country country : countries) {
            if (country instanceof SouthAmericaCountry) {
                southAmericaCountries[count++] = (SouthAmericaCountry) country;
            }
        }

        return Arrays.copyOf(southAmericaCountries, count);
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] sortedCountries = sortByDecreasingPopulation();

        Country[] mostPopulous = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            mostPopulous[i] = sortedCountries[i];
        }

        return mostPopulous;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] sortedCountries = sortByIncreasingPopulation();

        Country[] leastPopulous = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            leastPopulous[i] = sortedCountries[i];
        }

        return leastPopulous;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] sortedCountries = sortByDecreasingArea();

        Country[] largestArea = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            largestArea[i] = sortedCountries[i];
        }

        return largestArea;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] sortedCountries = sortByIncreasingArea();

        Country[] smallestArea = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            smallestArea[i] = sortedCountries[i];
        }

        return smallestArea;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] sortedCountries = sortByDecreasingGdp();

        Country[] highestGdp = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            highestGdp[i] = sortedCountries[i];
        }

        return highestGdp;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] sortedCountries = sortByIncreasingGdp();

        Country[] lowestGdp = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            lowestGdp[i] = sortedCountries[i];
        }

        return lowestGdp;
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
