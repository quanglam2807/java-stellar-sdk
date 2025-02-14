// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;


import java.io.IOException;

import com.google.common.base.Objects;

// === xdr source ============================================================

//  struct LedgerBounds
//  {
//      uint32 minLedger;
//      uint32 maxLedger; // 0 here means no maxLedger
//  };

//  ===========================================================================
public class LedgerBounds implements XdrElement {
  public LedgerBounds () {}
  private Uint32 minLedger;
  public Uint32 getMinLedger() {
    return this.minLedger;
  }
  public void setMinLedger(Uint32 value) {
    this.minLedger = value;
  }
  private Uint32 maxLedger;
  public Uint32 getMaxLedger() {
    return this.maxLedger;
  }
  public void setMaxLedger(Uint32 value) {
    this.maxLedger = value;
  }
  public static void encode(XdrDataOutputStream stream, LedgerBounds encodedLedgerBounds) throws IOException{
    Uint32.encode(stream, encodedLedgerBounds.minLedger);
    Uint32.encode(stream, encodedLedgerBounds.maxLedger);
  }
  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static LedgerBounds decode(XdrDataInputStream stream) throws IOException {
    LedgerBounds decodedLedgerBounds = new LedgerBounds();
    decodedLedgerBounds.minLedger = Uint32.decode(stream);
    decodedLedgerBounds.maxLedger = Uint32.decode(stream);
    return decodedLedgerBounds;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.minLedger, this.maxLedger);
  }
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof LedgerBounds)) {
      return false;
    }

    LedgerBounds other = (LedgerBounds) object;
    return Objects.equal(this.minLedger, other.minLedger) && Objects.equal(this.maxLedger, other.maxLedger);
  }

  public static final class Builder {
    private Uint32 minLedger;
    private Uint32 maxLedger;

    public Builder minLedger(Uint32 minLedger) {
      this.minLedger = minLedger;
      return this;
    }

    public Builder maxLedger(Uint32 maxLedger) {
      this.maxLedger = maxLedger;
      return this;
    }

    public LedgerBounds build() {
      LedgerBounds val = new LedgerBounds();
      val.setMinLedger(minLedger);
      val.setMaxLedger(maxLedger);
      return val;
    }
  }
}
