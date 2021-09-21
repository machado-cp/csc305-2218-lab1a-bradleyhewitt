package edu.calpoly.csc305.lab1a;

class Driver {
  public static void main(String[] args) {
    Example ex = new Example();
    int total = 0;

    for (int num : ex.getNums()) {
      total += num;
    }

    System.out.println(total);
    System.out.println(ex.sameName("305"));
  }
}

