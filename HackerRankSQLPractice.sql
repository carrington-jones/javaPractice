# Query all columns for all American cities in the CITY table with populations larger than 100000. The CountryCode for America is USA.
# Solution: SELECT * FROM CITY WHERE COUNTRYCODE = "USA" AND POPULATION > 100000;

# Query the NAME field for all American cities in the CITY table with populations larger than 120000. The CountryCode for America is USA.
# Solution: SELECT NAME FROM CITY WHERE COUNTRYCODE = "USA" AND POPULATION > 120000;

# Query all columns for a city in CITY with the ID 1661.
# Solution: SELECT * FROM CITY WHERE ID = 1661;

# Query all attributes of every Japanese city in the CITY table. The COUNTRYCODE for Japan is JPN.
# SELECT NAME FROM CITY WHERE COUNTRYCODE = "JPN";

# Query a list of CITY and STATE from the STATION table.
# SELECT CITY, STATE FROM STATION;

# Query a list of CITY names from STATION for cities that have an even ID number. Print the results in any order, but exclude duplicates from the answer.
# SELECT DISTINCT CITY FROM STATION WHERE ID % 2 = 0;

