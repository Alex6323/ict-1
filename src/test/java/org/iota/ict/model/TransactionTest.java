package org.iota.ict.model;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class TransactionTest {
    private static final String MAINNET_TRYTES = "SEGQSWYCJHRLJYEGZLRYQAZPLVRAYIWGWJUMFFX99UZUKBQNFYAOQLOFARIKNEBKDRHJJWDJARXTNPHPAODJRSGJBVVYBVJHZALJWDCJHZRSACOVCVVAVHZVTPFTAJWVGFSVLSYXHNNXEGSMJHDBZKGFQNYJJJBAPDHFFGZ9POSOMWTDPGXI9KQRLMUVWNEQDANMXROVORJVALWVGDDJAFOOBXUKVCCIVXSSHZUCZV9XVBASLWX9NXPWGMGYCRD9ILQMKIGPBGGMKAIJKNALBLABATYFVIRBKTXTWNUZAUXRASB9EEIQHWBD9ZYUDBUPBSWXVYXQXECRCHQAYH9ZBUZBASPOIGBSGWJYFKFRITUBVMCYGCMAPTXOIWEVTUXSUOUPTUQOPMMPUTHXMOP9CW9THAZXEPMOMNEOBLUBPOAIOBEBERRZCIKHSTDWUSUPUWNJOCLNZDCEKWWAAJDPJXJEHHSYFN9MH9BGUDQ9CSZBIHRC9PSQJPGKH9ILZDWUWLEKWFKUFFFIMOQKRMKOYXEJHXLCEGCGGKHGJUHOXINSWCKRNMUNAJDCVLZGEBII9ASTYFTDYDZIZSNHIWHSQ9HODQMVNDKMKHCFDXIIGDIVJSBOOE9GRIXCD9ZUTWCUDKFTETSYSRBQABXCXZFOWQMQFXHYZWD9JZXUWHILMRNWXSGUMIIXZYCTWWHCWMSSTCNSQXQXMQPTM9MOQMIVDYNNARDCVNQEDTBKWOIOSKPKPOZHJGJJGNYWQWUWAZMBZJ9XEJMRVRYFQPJ9NOIIXEGIKMMN9DXYQUILRSCSJDIDN9DCTFGQIYWROZQIEQTKMRVLGGDGA9UVZPNRGSVTZYAPMWFUWDEUULSEEGAGITPJQ9DBEYEN9NVJPUWZTOTJHEQIXAPDOICBNNCJVDNM9YRNXMMPCOYHJDUFNCYTZGRCBZKOLHHUK9VOZWHEYQND9WUHDNGFTAS99MRCAU9QOYVUZKTIBDNAAPNEZBQPIRUFUMAWVTCXSXQQIYQPRFDUXCLJNMEIKVAINVCCZROEWEX9XVRM9IHLHQCKC9VLK9ZZWFBJUZKGJCSOPQPFVVAUDLKFJIJKMLZXFBMXLMWRSNDXRMMDLE9VBPUZB9SVLTMHA9DDDANOKIPY9ULDWAKOUDFEDHZDKMU9VMHUSFG9HRGZAZULEJJTEH9SLQDOMZTLVMBCXVNQPNKXRLBOUCCSBZRJCZIUFTFBKFVLKRBPDKLRLZSMMIQNMOZYFBGQFKUJYIJULGMVNFYJWPKPTSMYUHSUEXIPPPPPJTMDQLFFSFJFEPNUBDEDDBPGAOEJGQTHIWISLRDAABO9H9CSIAXPPJYCRFRCIH9TVBZKTCK9SPQZUYMUOKMZYOMPRHRGF9UAKZTZZG9VVVTIHMSNDREUOUOSLKUHTNFXTNSJVPVWCQXUDIMJIAMBPXUGBNDTBYPKYQYJJCDJSCTTWHOJKORLHGKRJMDCMRHSXHHMQBFJWZWHNUHZLYOAFQTRZFXDBYASYKWEVHKYDTJIAUKNCCEPSW9RITZXBOFKBAQOWHKTALQSCHARLUUGXISDMBVEUKOVXTKTEVKLGYVYHPNYWKNLCVETWIHHVTBWT9UPMTQWBZPRPRSISUBIBECVDNIZQULAGLONGVFLVZPBMHJND9CEVIXSYGFZAGGN9MQYOAKMENSEOGCUNKEJTDLEDCD9LGKYANHMZFSSDDZJKTKUJSFL9GYFDICTPJEPDSBXDQTARJQEWUVWDWSQPKIHPJONKHESSQH9FNQEO9WUCFDWPPPTIQPWCVDYTTWPLCJJVYNKE9ZEJNQBEJBMDBLNJKQDOQOHVS9VY9UPSU9KZVDFOESHNRRWBK9EZCYALAUYFGPCEWJQDXFENSNQEAUWDXJGOMCLQUQWMCPHOBZZ9SZJ9KZXSHDLPHPNYMVUJQSQETTN9SG9SIANJHWUYQXZXAJLYHCZYRGITZYQLAAYDVQVNKCDIYWAYBAFBMAYEAEAGMTJGJRSNHBHCEVIQRXEFVWJWOPU9FPDOWIFL9EWGHICRBNRITJDZNYACOGTUDBZYIYZZWAOCDBQFFNTTSTGKECWTVWZSPHX9HNRUYEAEWXENEIDLVVFMZFVPUNHMQPAIOKVIBDIHQIHFGRJOHHONPLGBSJUD9HHDTQQUZN9NVJYOAUMXMMOCNUFLZ9BAJSZMDMPQHPWSFVWOJQDPHV9DYSQPIBL9LYZHQKKOVF9TFVTTXQEUWFQSLGLVTGK99VSUEDXIBIWCQHDQQSQLDHZ9999999999999999999TRINITY99999999999999999999TNXSQ9D99A99999999B99999999MXKZAGDGKVADXOVCAXEQYZGOGQKDLKIUPYXIL9PXYBQXGYDEGNXTFURSWQYLJDFKEV9VVBBQLTLHIBTFYOGBHPUUHS9CKWSAPIMDIRNSUJ9CFPGKTUFAGQYVMFKOZSVAHIFJXWCFBZLICUWF9GNDZWCOWDUIIZ9999OXNRVXLBKJXEZMVABR9UQBVSTBDFSAJVRRNFEJRL9UFTOFPJHQMQKAJHDBIQAETS9OUVTQ9DSPAOZ9999TRINITY99999999999999999999LPZYMWQME999999999MMMMMMMMMDTIZE9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999";
    private static final String EXAMPLE_TRYTES = MAINNET_TRYTES.substring(0, 2187)
            + MAINNET_TRYTES.substring(2187 + 162, 2187 + 162 + 81)
            + MAINNET_TRYTES.substring(2187, 2187 + 162)
            + MAINNET_TRYTES.substring(2187 + 162 + 81);
    ;
    private static final String EXAMPLE_ADDRESS = "BAJSZMDMPQHPWSFVWOJQDPHV9DYSQPIBL9LYZHQKKOVF9TFVTTXQEUWFQSLGLVTGK99VSUEDXIBIWCQHD";

    @Test
    public void testTransactionDecoding() {
        Transaction transaction = new Transaction(EXAMPLE_TRYTES);
        Assert.assertEquals("transaction address", EXAMPLE_ADDRESS, transaction.address);
        Assert.assertEquals("value", BigInteger.valueOf(-7297419313L), transaction.value);
        Assert.assertEquals("timestamp", 1544207541879L, transaction.attachmentTimestamp);
    }

    @Test
    public void testTransactionBuilder() {
        TransactionBuilder builder = new TransactionBuilder();
        builder.address = EXAMPLE_ADDRESS;
        Transaction transaction = builder.build();
        Assert.assertEquals(transaction.address, builder.address);
    }

    @Test
    public void testTransactionEncodingDecoding() {
        Transaction original = new Transaction(EXAMPLE_TRYTES);
        Transaction copy = new Transaction(original.trytes);
        Assert.assertEquals(copy.address, EXAMPLE_ADDRESS);
        Assert.assertEquals(copy.trytes, original.trytes);
    }

    @Test
    public void testCurl123() {
        Transaction transaction = new Transaction(EXAMPLE_TRYTES);
        Assert.assertEquals("DAEFHBJKDCGV9HRNECOBMLNHKEPYPDNNDXUSFCFKD9YKWSHMMYMCQJAVTWBVHWZDCPYNOJCRLZUVMKNBK", transaction.hash);
    }
}