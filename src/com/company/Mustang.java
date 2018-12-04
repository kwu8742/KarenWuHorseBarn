package com.company;

public class Mustang implements Horse {
  private String name;
  private int weight;

  public Mustang(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }
  @Override
  public String getName() {
    return name;
  }
  @Override
  public int getWeight() {
    return weight;
  }

  public String toString() {
    String output = "";
    output += this.getName() + "," + "weights: " + this.getWeight();
    return output;
  }
}
