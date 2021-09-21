package edu.calpoly.csc305.lab1a;

class Example {
  private final String name;
  private int[] nums;

  public Example() {
    this.name = "Bradley";
    this.nums = new int[]{5, 10, 15, 20, 25};
  }

  boolean sameName(String other) {
    return other.equals(name);
  }

  public int[] getNums() {
    return nums;
  }
}  
