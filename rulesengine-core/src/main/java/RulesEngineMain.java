import tools.jackson.databind.ObjectMapper;


void main() {

    ObjectMapper mapper = new ObjectMapper();
    // Grab the rules from json file
    Processer processer = mapper.readValue(new File("rulesengine-core/src/main/resources/rules.json"), Processer.class);



}
