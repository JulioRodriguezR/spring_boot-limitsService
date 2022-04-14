package com.juliorodriguez.microservices.limitsservice.bean;

public class Limits {

  private int min;
  private int max;

  public Limits(int min, int max) {
    this.min = min;
    this.max = max;
  }

  public int getMax() {
    return max;
  }

  public int getMin() {
    return min;
  }

  public void setMin(int min) {
    this.min = min;
  }

  public void setMax(int max) {
    this.max = max;
  }

}
