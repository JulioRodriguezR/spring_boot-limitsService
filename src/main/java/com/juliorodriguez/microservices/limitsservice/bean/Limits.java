package com.juliorodriguez.microservices.limitsservice.bean;

public class Limits {

  private int minimum;
  private int maximum;

  public Limits(int min, int max) {
    this.minimum = min;
    this.maximum = max;
  }

  public int getMax() {
    return maximum;
  }

  public int getMin() {
    return minimum;
  }

  public void setMin(int min) {
    this.minimum = min;
  }

  public void setMax(int max) {
    this.maximum = max;
  }

}
