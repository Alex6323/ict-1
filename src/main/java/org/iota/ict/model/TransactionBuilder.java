package org.iota.ict.model;

import org.iota.ict.utils.Trytes;

import java.math.BigInteger;

public class TransactionBuilder {
    public String signatureFragments = generateDummyTrytes(Transaction.Field.SIGNATURE_FRAGMENTS);
    public String extraDataDigest = generateDummyTrytes(Transaction.Field.EXTRA_DATA_DIGEST);
    public String address = generateDummyTrytes(Transaction.Field.ADDRESS);
    public BigInteger value = BigInteger.ZERO;
    public long issuanceTimestamp;
    public long timelockLowerBound, timelockUpperBound;
    public String bundleNonce = generateDummyTrytes(Transaction.Field.BUNDLE_NONCE);
    public String trunk = generateDummyTrytes(Transaction.Field.TRUNK);
    public String branch = generateDummyTrytes(Transaction.Field.BRANCH);
    public String tag = generateDummyTrytes(Transaction.Field.TAG);
    public long attachmentTimestamp, attachmentTimestampLowerBound, attachmentTimestampUpperBound;
    public String nonce = Trytes.randomSequenceOfLength(Transaction.Field.NONCE.tryteLength);
    public String requestHash = generateDummyTrytes(Transaction.Field.REQUEST_HASH);

    public void asciiMessage(String asciiMessage) {
        signatureFragments = Trytes.padRight(Trytes.fromAscii(asciiMessage), Transaction.Field.SIGNATURE_FRAGMENTS.tryteLength);
    }

    private static String generateDummyTrytes(Transaction.Field field) {
        return Trytes.padRight("", field.tryteLength);
    }

    public Transaction build() {
        return new Transaction(this);
    }
}