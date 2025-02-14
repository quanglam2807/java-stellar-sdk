// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;


import java.io.IOException;

import com.google.common.base.Objects;

// === xdr source ============================================================

//  struct LiquidityPoolConstantProductParameters
//  {
//      Asset assetA; // assetA < assetB
//      Asset assetB;
//      int32 fee; // Fee is in basis points, so the actual rate is (fee/100)%
//  };

//  ===========================================================================
public class LiquidityPoolConstantProductParameters implements XdrElement {
  public LiquidityPoolConstantProductParameters () {}
  private Asset assetA;
  public Asset getAssetA() {
    return this.assetA;
  }
  public void setAssetA(Asset value) {
    this.assetA = value;
  }
  private Asset assetB;
  public Asset getAssetB() {
    return this.assetB;
  }
  public void setAssetB(Asset value) {
    this.assetB = value;
  }
  private Int32 fee;
  public Int32 getFee() {
    return this.fee;
  }
  public void setFee(Int32 value) {
    this.fee = value;
  }
  public static void encode(XdrDataOutputStream stream, LiquidityPoolConstantProductParameters encodedLiquidityPoolConstantProductParameters) throws IOException{
    Asset.encode(stream, encodedLiquidityPoolConstantProductParameters.assetA);
    Asset.encode(stream, encodedLiquidityPoolConstantProductParameters.assetB);
    Int32.encode(stream, encodedLiquidityPoolConstantProductParameters.fee);
  }
  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static LiquidityPoolConstantProductParameters decode(XdrDataInputStream stream) throws IOException {
    LiquidityPoolConstantProductParameters decodedLiquidityPoolConstantProductParameters = new LiquidityPoolConstantProductParameters();
    decodedLiquidityPoolConstantProductParameters.assetA = Asset.decode(stream);
    decodedLiquidityPoolConstantProductParameters.assetB = Asset.decode(stream);
    decodedLiquidityPoolConstantProductParameters.fee = Int32.decode(stream);
    return decodedLiquidityPoolConstantProductParameters;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.assetA, this.assetB, this.fee);
  }
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof LiquidityPoolConstantProductParameters)) {
      return false;
    }

    LiquidityPoolConstantProductParameters other = (LiquidityPoolConstantProductParameters) object;
    return Objects.equal(this.assetA, other.assetA) && Objects.equal(this.assetB, other.assetB) && Objects.equal(this.fee, other.fee);
  }

  public static final class Builder {
    private Asset assetA;
    private Asset assetB;
    private Int32 fee;

    public Builder assetA(Asset assetA) {
      this.assetA = assetA;
      return this;
    }

    public Builder assetB(Asset assetB) {
      this.assetB = assetB;
      return this;
    }

    public Builder fee(Int32 fee) {
      this.fee = fee;
      return this;
    }

    public LiquidityPoolConstantProductParameters build() {
      LiquidityPoolConstantProductParameters val = new LiquidityPoolConstantProductParameters();
      val.setAssetA(assetA);
      val.setAssetB(assetB);
      val.setFee(fee);
      return val;
    }
  }
}
