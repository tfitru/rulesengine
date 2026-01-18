import tools.jackson.databind.ObjectMapper;


void main() throws FileNotFoundException {

    ObjectMapper mapper = new ObjectMapper();
    // Grab the rules from json file
    Processer processer = mapper.readValue(new File("rulesengine-core/src/main/resources/rules.json"), Processer.class);

    String creditScoreMatch = "Credit Score \\d{3}";
    String creditHistoryMatch = "Credit History \\d{2}";

    File creditReport1 = new File("rulesengine-core/src/main/resources/randomcreditreport.txt");
    String creditReport1Input = readFileStoreString(creditReport1);


    Pattern creditScore = Pattern.compile(creditScoreMatch,  Pattern.CASE_INSENSITIVE);
    Pattern creditHistory = Pattern.compile(creditHistoryMatch, Pattern.CASE_INSENSITIVE);


    Matcher creditScoreMatcher = creditScore.matcher(creditReport1Input);
    Matcher creditHistoryMatcher = creditHistory.matcher(creditReport1Input);


    if(creditScoreMatcher.matches()
            && creditHistoryMatcher.matches()) {
        System.out.println("Credit Score Match");
        System.out.println("Credit History Match");

        // Need to extract the numbers

    }
}

 public static String readFileStoreString(File fileName) throws FileNotFoundException {
    StringBuilder stringBuilder = new StringBuilder();
    try(Scanner myReader = new Scanner(fileName)){
             while(myReader.hasNextLine()){
                 stringBuilder.append(myReader.nextLine());
             }

             return stringBuilder.toString();

    } catch (Exception e) {
         System.out.println(e.getMessage());
    }

    return null;
 }
