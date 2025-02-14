// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;


import java.io.IOException;

import com.google.common.base.Objects;

// === xdr source ============================================================

//  struct AccountEntryExtensionV3
//  {
//      // We can use this to add more fields, or because it is first, to
//      // change AccountEntryExtensionV3 into a union.
//      ExtensionPoint ext;
//  
//      // Ledger number at which `seqNum` took on its present value.
//      uint32 seqLedger;
//  
//      // Time at which `seqNum` took on its present value.
//      TimePoint seqTime;
//  };

//  ===========================================================================
public class AccountEntryExtensionV3 implements XdrElement {
  public AccountEntryExtensionV3 () {}
  private ExtensionPoint ext;
  public ExtensionPoint getExt() {
    return this.ext;
  }
  public void setExt(ExtensionPoint value) {
    this.ext = value;
  }
  private Uint32 seqLedger;
  public Uint32 getSeqLedger() {
    return this.seqLedger;
  }
  public void setSeqLedger(Uint32 value) {
    this.seqLedger = value;
  }
  private TimePoint seqTime;
  public TimePoint getSeqTime() {
    return this.seqTime;
  }
  public void setSeqTime(TimePoint value) {
    this.seqTime = value;
  }
  public static void encode(XdrDataOutputStream stream, AccountEntryExtensionV3 encodedAccountEntryExtensionV3) throws IOException{
    ExtensionPoint.encode(stream, encodedAccountEntryExtensionV3.ext);
    Uint32.encode(stream, encodedAccountEntryExtensionV3.seqLedger);
    TimePoint.encode(stream, encodedAccountEntryExtensionV3.seqTime);
  }
  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static AccountEntryExtensionV3 decode(XdrDataInputStream stream) throws IOException {
    AccountEntryExtensionV3 decodedAccountEntryExtensionV3 = new AccountEntryExtensionV3();
    decodedAccountEntryExtensionV3.ext = ExtensionPoint.decode(stream);
    decodedAccountEntryExtensionV3.seqLedger = Uint32.decode(stream);
    decodedAccountEntryExtensionV3.seqTime = TimePoint.decode(stream);
    return decodedAccountEntryExtensionV3;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.ext, this.seqLedger, this.seqTime);
  }
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof AccountEntryExtensionV3)) {
      return false;
    }

    AccountEntryExtensionV3 other = (AccountEntryExtensionV3) object;
    return Objects.equal(this.ext, other.ext) && Objects.equal(this.seqLedger, other.seqLedger) && Objects.equal(this.seqTime, other.seqTime);
  }

  public static final class Builder {
    private ExtensionPoint ext;
    private Uint32 seqLedger;
    private TimePoint seqTime;

    public Builder ext(ExtensionPoint ext) {
      this.ext = ext;
      return this;
    }

    public Builder seqLedger(Uint32 seqLedger) {
      this.seqLedger = seqLedger;
      return this;
    }

    public Builder seqTime(TimePoint seqTime) {
      this.seqTime = seqTime;
      return this;
    }

    public AccountEntryExtensionV3 build() {
      AccountEntryExtensionV3 val = new AccountEntryExtensionV3();
      val.setExt(ext);
      val.setSeqLedger(seqLedger);
      val.setSeqTime(seqTime);
      return val;
    }
  }
}
