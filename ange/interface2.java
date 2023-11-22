class interface2 {
  public static void main(String[] args) {
    ProgrammingLanguage language = new ProgrammingLanguage();
    language.getName("Java");
  }
}
interface Language {
  void getName(String name);
}

class ProgrammingLanguage implements Language {

  public void getName(String name) {
    System.out.println("Programming Language: " + name);
  }
}

