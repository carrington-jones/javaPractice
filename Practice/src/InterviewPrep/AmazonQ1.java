package InterviewPrep;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class AmazonQ1 {


    class Result {

        /*
         * Complete the 'searchSuggestions' function below.
         *
         * The function is expected to return a 2D_STRING_ARRAY.
         * The function accepts following parameters:
         *  1. STRING_ARRAY repository
         *  2. STRING customerQuery
         */

        public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
            List<List<String>> retList = new ArrayList();

            String s="";
//            Arrays.sort(repository);

            for(char c : customerQuery.toCharArray()) {
                s+=c;
                List<String> temp = new ArrayList();

                for(String product : repository) {
                    if(product.startsWith(s) && temp.size()<3) {
                        temp.add(product);
                    }
                }

                retList.add(temp);
            }


            return retList;
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int repositoryCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> repository = IntStream.range(0, repositoryCount).mapToObj(i -> {
                        try {
                            return bufferedReader.readLine();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .collect(toList());

            String customerQuery = bufferedReader.readLine();

            List<List<String>> result = Result.searchSuggestions(repository, customerQuery);

            result.stream()
                    .map(
                            r -> r.stream()
                                    .collect(joining(" "))
                    )
                    .map(r -> r + "\n")
                    .collect(toList())
                    .forEach(e -> {
                        try {
                            bufferedWriter.write(e);
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    });

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
