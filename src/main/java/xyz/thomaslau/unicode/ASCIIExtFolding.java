package xyz.thomaslau.unicode;

public class ASCIIExtFolding {
    public static void filter(final char c, char[] output) {
        // System.out.println("-"+c);
        // Quick test: if it's not in range then just keep current character
        int outputPos = 0;
        output[0] = 0;
        output[1] = 0;
        if (c < '\u0080') {
            output[outputPos++] = c;
            return;
        } else {
            switch (c) {
            case '\u0363':
            case '\u0386':
            case '\u0391':
            case '\u03AC':
            case '\u03B1':
            case '\u0410':
            case '\u04D0':
            case '\u04D2':
            case '\u13AA':
            case '\u15C5':
            case '\u15CB':
            case '\u15E9':
            case '\u1F08':
            case '\u1F09':
            case '\u1F0A':
            case '\u1F0B':
            case '\u1F0C':
            case '\u1F0D':
            case '\u1F0E':
            case '\u1F0F':
            case '\u1F88':
            case '\u1F89':
            case '\u1F8A':
            case '\u1F8B':
            case '\u1F8C':
            case '\u1F8D':
            case '\u1F8E':
            case '\u1F8F':
            case '\u1FB8':
            case '\u1FB9':
            case '\u1FBA':
            case '\u1FBB':
            case '\u1FBC':
            case '\u237A':
            case '\u2376':
            case '\uA4EE':
            case '\uAB7A':
            case '\uA7BA':
            case '\uAB01':
            case '\uAB02':
            case '\uAB03':
            case '\uAB04':
            case '\uAB05':
            case '\uAB06':
            case '\u1F70':
            case '\u1F71':
            case '\u27D1':
            case '\u2A5C':
            case '\u13AF':
            case '\u1D2C':
            case '\u1D43':
            case '\u1D45':
            case '\u1D8F':
            case '\u1D90':
            case '\u1DE7':
            case '\u1DF2':
            case '\u20B3':
            case '\u2DF6':
            case '\u2DF8':
            case '\uA658':
            case '\uA659':
            case '\uAB7F':
                output[outputPos++] = 'A';
                break;
            case '\u2100':
                output[outputPos++] = 'a';
                output[outputPos++] = 'c';
                break;
            case '\u2101':
                output[outputPos++] = 'a';
                output[outputPos++] = 's';
                break;
            case '\u2382':
            case '\u2381':
                output[outputPos++] = 'a';
                output[outputPos++] = 'a';
                break;
            case '\u04D4':
            case '\u04D5':
            case '\u1D2D':
                output[outputPos++] = 'a';
                output[outputPos++] = 'e';
                break;
            case '\u33C2':
            case '\u33DF':
                output[outputPos++] = 'a';
                output[outputPos++] = 'm';
                break;
            case '\u0430':
            case '\u04D1':
            case '\u04D3':
            case '\u1972':
            case '\u1F00':
            case '\u1F01':
            case '\u1F02':
            case '\u1F03':
            case '\u1F04':
            case '\u1F05':
            case '\u1F06':
            case '\u1F07':
            case '\u1F80':
            case '\u1F81':
            case '\u1F82':
            case '\u1F83':
            case '\u1F84':
            case '\u1F85':
            case '\u1F86':
            case '\u1F87':
            case '\u1FB0':
            case '\u1FB1':
            case '\u1FB2':
            case '\u1FB3':
            case '\u1FB4':
            case '\u1FB5':
            case '\u1FB6':
            case '\u1FB7':
            case '\u2383':
            case '\uA7BB':
            case '\u1902':
            case '\u1951':
            case '\u2380':
                output[outputPos++] = 'a';
                break;
            case '\u0392':
            case '\u03B2':
            case '\u0412':
            case '\u0432':
            case '\u13F4':
            case '\u13FC':
            case '\u15F7':
            case '\u15F8':
            case '\u15F9':
            case '\u1656':
            case '\u1657':
            case '\u1658':
            case '\u1659':
            case '\u165D':
            case '\u165E':
            case '\u165F':
            case '\u1660':
            case '\u1669':
            case '\u166A':
            case '\u166B':
            case '\u166C':
            case '\u2C82':
            case '\u2C83':
            case '\uA4D0':
            case '\uA796':
            case '\uA797':
            case '\uA7B4':
            case '\u13F0':
            case '\u13F8':
            case '\u16D4':
            case '\u1D2E':
            case '\u1D2F':
            case '\u1D47':
            case '\u1D5D':
            case '\u1D66':
            case '\u1D80':
            case '\u1DE8':
            case '\u1DE9':
            case '\u20BF':
            case '\u2DE1':
            case '\u2DFA':
            case '\uA557':
                output[outputPos++] = 'B';
                break;
            case '\u07D5':
            case '\u042A':
            case '\u042C':
            case '\u044A':
            case '\u15AF':
            case '\u13CF':
            case '\u10EE':
            case '\u1472':
            case '\u1473':
            case '\u147E':
            case '\u147F':
            case '\u1480':
            case '\u1481':
            case '\u1482':
            case '\u1483':
            case '\u150E':
            case '\u1583':
            case '\u1584':
            case '\u1585':
            case '\uAB9F':
            case '\u048C':
            case '\u048D':
            case '\u0411':
            case '\u044C':
            case '\u0462':
            case '\u0463':
            case '\u2C13':
            case '\u2C43':
            case '\u10A6':
            case '\u10FC':
            case '\u18B8':
            case '\u18B9':
            case '\u1C86':
            case '\u1C87':
            case '\u2422':
            case '\u266D':
            case '\u2D06':
            case '\uA678':
            case '\uA67A':
            case '\uA69D':
                output[outputPos++] = 'b';
                break;
            case '\u04F8':
            case '\u04F9':
                output[outputPos++] = 'b';
                output[outputPos++] = 'i';
                break;
            case '\u33C3':
                output[outputPos++] = 'b';
                output[outputPos++] = 'q';
                break;
            case '\u0368':
            case '\u03F2':
            case '\u0441':
            case '\u10A0':
            case '\u1974':
            case '\u14BC':
            case '\u2102':
            case '\u1639':
            case '\u217D':
            case '\u2201':
            case '\u2282':
            case '\u228F':
            case '\u2103':  //DEGREE CELSIUS    ℃
            case '\u22D0':
            case '\u2CA4':
            case '\u2CA5':
            case '\uABB8':
            case '\uA792':
            case '\uA793':
            case '\uA794':
            case '\uA7C4':
            case '\u1202':
            case '\u1204':
            case '\u1203':
            case '\u122D':
            case '\u122E':
            case '\u184C':
            case '\u1857':
            case '\u1889':
            case '\u1897':
            case '\u18B7':
            case '\u1858':
            case '\u2283':
            case '\u2284':
            case '\u2286':
            case '\u2288':
            case '\u228A':
            case '\u2290':
            case '\u2291':
            case '\u2292':
            case '\uA6D5':
            case '\uA700':
            case '\uA701':
            case '\uA702':
            case '\uA703':
            case '\uA724':
            case '\uA725':
            case '\uA787':
            case '\u2ABD':
            case '\u2ABF':
            case '\u2AC1':
            case '\u2AC3':
            case '\u2AC5':
            case '\u2AC7':
            case '\u2AC9':
            case '\u2ACB':
            case '\u2ACD':
            case '\u2985':
            case '\u2988':
            case '\u298D':
            case '\u298F':
            case '\uA143':
            case '\uA253':
            case '\uA254':
            case '\uA313':
            case '\uA49F':
            case '\u18BD':
            case '\u19DA':
                output[outputPos++] = 'c';
                break;
            case '\u20A0':
                output[outputPos++] = 'c';
                output[outputPos++] = 'e';
                break;
            case '\u33C5':
                output[outputPos++] = 'c';
                output[outputPos++] = 'd';
                break;
            case '\u33C7':
                output[outputPos++] = 'c';
                output[outputPos++] = 'o';
                break;
            case '\u2DF5':
                output[outputPos++] = 'c';
                output[outputPos++] = 'r';
                break;
            case '\u03F9':
            case '\u0421':
            case '\u20A1':  // COLON SIGN   ₡
            case '\u13DF':
            case '\u216D':    // Roman Numeral Five
            case '\u04AA':  //Ҫ
            case '\u04AB':  //ҫ
            case '\u10BA':  //Ⴚ
            case '\u1455':
            case '\u1456':
            case '\u1461':
            case '\u1462':
            case '\u1463':
            case '\u1464':
            case '\u1465':
            case '\u1466':
            case '\u146A':
            case '\u150D':
            case '\u1645':
            case '\u20A2':
            case '\u2D4E':
            case '\uA49D':
            case '\uA4DA':
            case '\uA4DB':
            case '\uA90D':
            case '\uABAF':
            case '\uABB3':
            case '\u27C3':
            case '\u27C8':
            case '\u2CDE':
            case '\u2CDF':
            case '\u2E26':
            case '\u3108':
            case '\u2B8E':
            case '\u13E3':
            case '\u13E8':
            case '\u13E9':
            case '\u176F':
            case '\u1C83':
            case '\u1CBA':
            case '\u1D10':
            case '\u1D53':
            case '\u1D9D':
            case '\u1DD7':
            case '\u20AC':
            case '\u20B5':
            case '\u20BE':
            case '\u2183':
            case '\u2185':
            case '\u21AA':
            case '\u22E4':
            case '\u262A':
            case '\u2D00':
            case '\u2D5B':
            case '\u2DED':
            case '\u33C6':
            case '\uA57F':
            case '\uA580':
            case '\uA674':
                output[outputPos++] = 'C';
                break;
            case '\u13A0':
            case '\u216E':    // Roman Numeral Five
            case '\u15DE':
            case '\u13EA':
            case '\u2AD0':
            case '\u2AD2':
            case '\uAB70':
            case '\uA7C7':
            case '\u1D30':
            case '\u1D48':
            case '\u1D81':
            case '\u1D91':
            case '\u1D92':
            case '\u2181':
            case '\u2187':
                output[outputPos++] = 'D';
                break;
            case '\u0369':
            case '\u0500':
            case '\u0501':
            case '\u0502':
            case '\u0503':
            case '\u20AB':    // DONG SIGN   ₫
            case '\u146F':
            case '\u1470':
            case '\u147A':
            case '\u147B':
            case '\u147C':
            case '\u147D':
            case '\u1471':
            case '\u1484':
            case '\u1487':
            case '\u1581':
            case '\u1582':
            case '\u217E':
            case '\uA4D2':
            case '\uA4D3':
            case '\uABB7':
            case '\u13E7':
                output[outputPos++] = 'd';
                break;
            case '\u33C8':
                output[outputPos++] = 'd';
                output[outputPos++] = 'b';
                break;
            case '\u0388':
            case '\u0395':
            case '\u0400':
            case '\u0401':
            case '\u0415':
            case '\u13AC':
            case '\u1F18':
            case '\u1F19':
            case '\u1F1A':
            case '\u1F1B':
            case '\u1F1C':
            case '\u1F1D':
            case '\u1FC8':
            case '\u1FC9':
            case '\u2D39':
            case '\uA4F0':
            case '\uA915':
            case '\uAB7C':
            case '\u22F5':
            case '\u22F6':
            case '\u22F7':
            case '\u22F8':
            case '\u22FF':
            case '\uA3C1':
            case '\uA3C2':
            case '\u1D31':
            case '\u1D49':
            case '\u2377':
            case '\u2DF7':
            case '\uA5CB':
                output[outputPos++] = 'E';
                break;
            case '\u0364':
            case '\u0435':
            case '\u04BC':
            case '\u04BD':
            case '\u04BE':
            case '\u04BF':
            case '\u04D6':
            case '\u04D7':
            case '\u04D8':
            case '\u04D9':
            case '\u04DA':
            case '\u04DB':
            case '\u0450':
            case '\u0451':
            case '\u1566':
            case '\u1567':
            case '\u1568':
            case '\u1569':
            case '\u156A':
            case '\u1971':
            case '\u19C9':
            case '\uAAC0':
            case '\uAB32':
            case '\uAB34':
            case '\u2D12':
                output[outputPos++] = 'e';
                break;
            case '\u03DC':
            case '\u04FA':
            case '\u04FB':
            case '\u15B4':
            case '\u2109':  // DEGREE FAHRENHEIT    ℉
            case '\u20A3':  // FRENCH FRANC SIGN   ₣
            case '\u2552':
            case '\uA4DD':
            case '\uA4DE':
            case '\uA430':
            case '\u1D82':
            case '\u1DA0':
            case '\u1DE5':
            case '\u1DEB':
                output[outputPos++] = 'F';
                break;
            case '\u03DD':
            case '\uAB35':
            case '\uA798':
            case '\uA799':
                output[outputPos++] = 'f';
                break;
            case '\u050C':
            case '\u13C0':
            case '\uA4D6':
            case '\uABB9':
            case '\uA7A0':
            case '\u13E5':
            case '\u13F3':
            case '\u13FD':
            case '\u1D33':
            case '\u1D4D':
            case '\u1D83':
            case '\u1DA2':
            case '\u1DDA':
            case '\u1DDB':
            case '\u20B2':
            case '\uAB90':
                output[outputPos++] = 'G';
                break;
            case '\u050D':
            case '\u210A':
            case '\uAB36':
            case '\uA7A1':
            case '\uA7AC':
            case '\uA91E':
            case '\uAA87':
            case '\u13FB':
                output[outputPos++] = 'g';
                break;
            case '\u33C9':
                output[outputPos++] = 'g';
                output[outputPos++] = 'y';
                break;
            case '\u0389':
            case '\u0397':
            case '\u048A':
            case '\u048B':
            case '\u04E2':
            case '\u04E3':
            case '\u04E4':
            case '\u04E5':
            case '\u045D':
            case '\u041D':
            case '\u043D':
            case '\u04A2':
            case '\u04A3':
            case '\u04A4':
            case '\u04A5':
            case '\u04C7':
            case '\u04C8':
            case '\u04C9':
            case '\u04CA':
            case '\u13BB':
            case '\u12D8':
            case '\u12DA':
            case '\u12D9':
            case '\u12DB':
            case '\u12DC':
            case '\u12DD':
            case '\u12DE':
            case '\u12DF':
            case '\u210B':
            case '\u210C':
            case '\u210D':
            case '\u210E':
            case '\u210F':
            case '\u157C':
            case '\u1F28':
            case '\u1F29':
            case '\u1F2A':
            case '\u1F2B':
            case '\u1F2C':
            case '\u1F2D':
            case '\u1F2E':
            case '\u1F2F':
            case '\u1F98':
            case '\u1F99':
            case '\u1F9A':
            case '\u1F9B':
            case '\u1F9C':
            case '\u1F9D':
            case '\u1F9E':
            case '\u1F9F':
            case '\u1FCA':
            case '\u1FCB':
            case '\u1FCC':
            case '\u2C8E':
            case '\u2C8F':
            case '\uA4E7':
            case '\uAB8B':
            case '\uA7AA':
            case '\uAB11':
            case '\uAB12':
            case '\uAB13':
            case '\uAB14':
            case '\uAB15':
            case '\uAB16':
                output[outputPos++] = 'H';
                break;
            case '\u33CA':
                output[outputPos++] = 'H';
                output[outputPos++] = 'A';
                break;
            case '\u33CB':
                output[outputPos++] = 'H';
                output[outputPos++] = 'P';
                break;
            case '\u02B0':
            case '\u02B1':
            case '\u036A':
            case '\u04BA':
            case '\u04BB':
            case '\u045B':
            case '\u050A':
            case '\u050B':
            case '\u0527':
            case '\u13C2':
            case '\uAB92':
            case '\uA795':
            case '\u16BA':
            case '\u1D34':
            case '\u1D78':
            case '\u2095':
            case '\u2DE9':
            case '\u10B9':
            case '\u13F2':
            case '\u144B':
            case '\uA6D6':
                output[outputPos++] = 'h';
                break;
            case '\u038A':
            case '\u0399':
            case '\u03AA':
            case '\u0406':
            case '\u0407':
            case '\u04CF':
            case '\u04C0':
            case '\u13C6':
            case '\u2160':             // Roman Numeral One
            case '\u1F38':
            case '\u1F39':
            case '\u1F3A':
            case '\u1F3B':
            case '\u1F3C':
            case '\u1F3D':
            case '\u1F3E':
            case '\u1F3F':
            case '\u1FD8':
            case '\u1FD9':
            case '\u1FDA':
            case '\u1FDB':
            case '\u13A8':
            case '\u13B0':
            case '\u17BB':
            case '\u1D35':
            case '\u1D4E':
            case '\u1D96':
            case '\u1DA4':
            case '\u1DA6':
            case '\u1DA7':
            case '\u23FD':
            case '\u2D4A':
            case '\u2D4F':
            case '\uA56F':
                output[outputPos++] = 'I';
                break;
            case '\u0365':
            case '\u03AF':
            case '\u03CA':
            case '\u0456':
            case '\u0457':
            case '\u13A5':
            case '\u1F30':
            case '\u1F31':
            case '\u1F32':
            case '\u1F33':
            case '\u1F34':
            case '\u1F35':
            case '\u1F36':
            case '\u1F37':
            case '\u2139':
            case '\u2170':
            case '\uA4F2':
            case '\uAB75':
            case '\uA676':
                output[outputPos++] = 'i';
                break;
            case '\u2171':
            case '\u2161':
            case '\u2DEB':
            case '\u2DF0':
            case '\u2DF2':
            case '\u2DF3':
            case '\u33CC':
                output[outputPos++] = 'i';
                output[outputPos++] = 'i';
                break;
            case '\u2173':
            case '\u2163':
                output[outputPos++] = 'i';
                output[outputPos++] = 'v';
                break;
            case '\u2178':
            case '\u2168':
                output[outputPos++] = 'i';
                output[outputPos++] = 'x';
                break;
            case '\u2DFB':
                output[outputPos++] = 'i';
                output[outputPos++] = 'O';
                break;
            case '\u2DFC':
                output[outputPos++] = 'i';
                output[outputPos++] = 'A';
                break;
            case '\u02B2':
            case '\u03F3':
            case '\u0458':
            case '\u2C7C':
            case '\u2149':
                output[outputPos++] = 'j';
                break;
            case '\u037F':
            case '\u0408':
            case '\u13AB':
            case '\u2111':
            case '\uA4D9':
            case '\uAB7B':
            case '\u148D':
            case '\u148E':
            case '\u148F':
            case '\u1498':
            case '\u1499':
            case '\u149A':
            case '\u149B':
            case '\u1D36':
            case '\u1DA8':
            case '\u2321':
                output[outputPos++] = 'J';
                break;
            case '\u039A':
            case '\u04A0':
            case '\u041A':
            case '\u045C':
            case '\u049A':
            case '\u049B':
            case '\u049C':
            case '\u049D':
            case '\u049E':
            case '\u049F':
            case '\u040C':
            case '\u051E':
            case '\u13E6':
            case '\u20AD':    // KIP SIGN    ₭
            case '\u1673':
            case '\u1674':
            case '\uA4D7':
            case '\uABB6':
            case '\uA7A2':
            case '\u16D5':
            case '\u1D37':
            case '\u1D4F':
            case '\u1D84':
            case '\u1DDC':
            case '\u2096':
            case '\u2CE4':
            case '\u2DE6':
                output[outputPos++] = 'K';
                break;
            case '\u03BA':
            case '\u04A1':
            case '\u051F':
            case '\u2C94':
            case '\u2C95':
            case '\uA7A3':
                output[outputPos++] = 'k';
                break;
            case '\u33CD':
                output[outputPos++] = 'K';
                output[outputPos++] = 'K';
                break;
            case '\u33CE':
                output[outputPos++] = 'K';
                output[outputPos++] = 'M';
                break;
            case '\u33CF':
                output[outputPos++] = 'K';
                output[outputPos++] = 'T';
                break;
            case '\u33B8':
                output[outputPos++] = 'K';
                output[outputPos++] = 'V';
                break;
            case '\u33BE':
                output[outputPos++] = 'K';
                output[outputPos++] = 'W';
                break;
            case '\u13DE':
            case '\u2112':
            case '\u216C':    // Roman Numeral L
            case '\u14AA':  //ᒪ
            case '\u14AB':
            case '\u14B6':
            case '\u14B7':
            case '\u14B8':
            case '\u14B9':
            case '\u14BA':
            case '\u14BB':
            case '\uA4E1':
            case '\uABAE':
            case '\uA7AD':
            case '\u2514':
            case '\u2515':
            case '\u2516':
            case '\u2517':
            case '\u2558':
            case '\u2559':
            case '\u255A':
            case '\u2CD0':
            case '\u2CD1':
            case '\u2E24':
            case '\u2E83':
            case '\u18BA':
            case '\u1D38':
            case '\u1D85':
            case '\u1DA5':
            case '\u1DA9':
            case '\u1DAA':
            case '\u1DAB':
            case '\u1DDD':
            case '\u1DDE':
            case '\u2097':
            case '\u20A4':
                output[outputPos++] = 'L';
                break;
            case '\u33D0':
                output[outputPos++] = 'L';
                output[outputPos++] = 'M';
                break;
            case '\u33D1':
                output[outputPos++] = 'L';
                output[outputPos++] = 'N';
                break;
            case '\u33D3':
                output[outputPos++] = 'L';
                output[outputPos++] = 'X';
                break;
            case '\u02E1':
            case '\u03B9':
            case '\u2113':
            case '\u217C':
            case '\u1968':
            case '\u2378':
                output[outputPos++] = 'l';
                break;
            case '\u03FA':
            case '\u039C':
            case '\u041C':
            case '\u043C':
            case '\u04CD':
            case '\u04CE':
            case '\u13B7':
            case '\u216F':    // Roman Numeral M
            case '\u20A5':    // MILL SIGN  ₥
            case '\uA4DF':
            case '\uAB87':
            case '\uA435':
            case '\u2AD9':
            case '\u2A4B':
            case '\uA8A9':
            case '\uA8AD':
            case '\uA8B3':
            case '\u16D6':
            case '\u16D7':
            case '\u17F3':
            case '\u1D39':
            case '\u1D50':
            case '\u1D86':
            case '\u1DAC':
            case '\u1DDF':
            case '\u2098':
            case '\u2DE8':
            case '\uA666':
            case '\uA667':
                output[outputPos++] = 'M';
                break;
            case '\u33D4':
                output[outputPos++] = 'M';
                output[outputPos++] = 'B';
                break;
            case '\u33B3':
                output[outputPos++] = 'M';
                output[outputPos++] = 'S';
                break;
            case '\u33B7':
            case '\u33B9':
                output[outputPos++] = 'M';
                output[outputPos++] = 'V';
                break;
            case '\u33BD':
            case '\u33BF':
                output[outputPos++] = 'M';
                output[outputPos++] = 'W';
                break;
            case '\u03AE':
            case '\u036B':
            case '\u1320':
            case '\u1321':
            case '\u1322':
            case '\u1323':
            case '\u1324':
            case '\u1325':
            case '\u1326':
            case '\u1327':
            case '\u03FB':
            case '\u153F':
            case '\u15F0':
            case '\u163B':
            case '\u164F':
            case '\u217F':
            case '\u2C98':
            case '\u2C99':
            case '\u2D05':
            case '\uA992':
            case '\uA99A':
            case '\uA9D1':
            case '\uA9DF':
            case '\uAA94':
            case '\uAA8B':
            case '\uAA91':
            case '\uAA40':
            case '\uAA41':
            case '\uAA47':
            case '\u1662':
            case '\u1813':
            case '\u1956':
            case '\u1957':
            case '\u1C14':
            case '\u1C6C':
            case '\uAB3A':
            case '\uAB51':
                output[outputPos++] = 'm';
                break;
            case '\u039D':
            case '\u041F':
            case '\u043F':
            case '\u1F20':
            case '\u1F21':
            case '\u1F22':
            case '\u1F23':
            case '\u1F24':
            case '\u1F25':
            case '\u1F26':
            case '\u1F27':
            case '\u1F74':
            case '\u1F75':
            case '\u1F90':
            case '\u1F91':
            case '\u1F92':
            case '\u1F93':
            case '\u1F94':
            case '\u1F95':
            case '\u1F96':
            case '\u1F97':
            case '\u2293':
            case '\u2115':
            case '\u20A6': //    NAIRA SIGN  ₦
            case '\u2C9A':
            case '\u2C9B':
            case '\uA4E0':
            case '\uA790':
            case '\uA7A4':
            case '\uA43E':
            case '\u2A40':
            case '\u2A43':
            case '\u2A44':
            case '\u2A4D':
            case '\u2B8F':
            case '\u1D3A':
            case '\u1D3B':
            case '\u1D51':
            case '\u1D54':
            case '\u1D87':
            case '\u1DAE':
            case '\u1DAF':
            case '\u1DB0':
            case '\u1DE0':
            case '\u1DE1':
            case '\u2099':
                output[outputPos++] = 'N';
                break;
            case '\u2116':
                output[outputPos++] = 'N';
                output[outputPos++] = 'o';
                break;
            case '\u33B5':
                output[outputPos++] = 'N';
                output[outputPos++] = 'V';
                break;
            case '\u33BB':
                output[outputPos++] = 'N';
                output[outputPos++] = 'W';
                break;
            case '\u03B7':
            case '\u041B':
            case '\u1260':
            case '\u1261':
            case '\u1262':
            case '\u1263':
            case '\u1264':
            case '\u1265':
            case '\u1266':
            case '\u1268':
            case '\u2D04':
            case '\u2D16':
            case '\uA791':
            case '\uA7A5':
            case '\uA91A':
            case '\uAAA6':
            case '\uAAA7':
            case '\u10B6':
            case '\u1459':
            case '\u145A':
            case '\u145B':
            case '\u145C':
            case '\u1641':
            case '\u1812':
            case '\u18EB':
            case '\u1952':
            case '\u1965':
            case '\u1966':
            case '\u2129':
            case '\u22C2':
            case '\uAB3B':
            case '\uAB3C':
                output[outputPos++] = 'n';
                break;
            case '\u038C':
            case '\u039F':
            case '\u03BF':
            case '\u03CC':
            case '\u041E':
            case '\u043E':
            case '\u04E6':
            case '\u04E7':
            case '\u04E8':
            case '\u04E9':
            case '\u04EA':
            case '\u04EB':
            case '\u0555':
            case '\u07C0':
            case '\u0A66':
            case '\u0B20':
            case '\u0CE6':
            case '\u0C66':
            case '\u09E6':
            case '\u09F9':
            case '\u12D0':
            case '\u17E0':
            case '\u1F48':
            case '\u1F49':
            case '\u1F4A':
            case '\u1F4B':
            case '\u1F4C':
            case '\u1F4D':
            case '\u1FF8':
            case '\u1FF9':
            case '\u2B58':
            case '\u2D54':
            case '\u3007':
            case '\uA4F3':
            case '\u2B2D':
            case '\u2B2F':
            case '\u2B55':
            case '\u2C22':
            case '\u2C52':
            case '\u3181':
            case '\u2CDC':
            case '\u2CDD':
            case '\u13BE':
            case '\u13C5':
            case '\u176A':
            case '\u1810':
            case '\u1946':
            case '\u1A80':
            case '\u1A90':
            case '\u1B50':
            case '\u1B5C':
            case '\u1B75':
            case '\u1BB0':
            case '\u1C50':
            case '\u1C5B':
            case '\u1C82':
            case '\u1CC3':
            case '\u1D11':
            case '\u1D3C':
            case '\u1D52':
            case '\u1D9E':
            case '\u1DBF':
            case '\u1DED':
            case '\u1DF3':
            case '\u23FA':
            case '\u2D59':
            case '\u2D5A':
            case '\u2DE0':
            case '\u2DEA':
            case '\u2DF4':
            case '\u10FF':
            case '\u199E':
            case '\u1C13':
            case '\u1C40':
            case '\u1CBF':
            case '\uAB3D':
                output[outputPos++] = 'O';
                break;
            case '\u0366':
            case '\u0585':
            case '\u07CB':
            case '\u0AE6':
            case '\u19D0':
            case '\u11F0':
            case '\u1F40':
            case '\u1F41':
            case '\u1F42':
            case '\u1F43':
            case '\u1F44':
            case '\u1F45':
            case '\u2134':
            case '\u25CB':
            case '\u25E6':
            case '\u25EF':
            case '\u2C9E':
            case '\u2C9F':
            case '\uAB95':
            case '\uA900':
            case '\uA9d0':
            case '\uA9DE':
            case '\u20D8':
            case '\u20D9':
            case '\u20DA':
            case '\u20DD':
            case '\u1F78':
            case '\u1F79':
            case '\u235B':
            case '\u235C':
            case '\u2364':
            case '\u2365':
            case '\u26AA':
            case '\u26AB':
            case '\u26AC':
            case '\u274D':
            case '\u29B5':
            case '\u29BE':
            case '\u29C2':
            case '\u29C3':
            case '\u2A00':
            case '\u2940':
            case '\u2941':
            case '\uA89D':
            case '\uA8D0':
            case '\uA9F0':
            case '\uAA50':
                output[outputPos++] = 'o';
                break;
            case '\u2CEA':
                output[outputPos++] = 'o';
                output[outputPos++] = 'c';
                break;
            case '\u11EE':
            case '\u3180':
            case '\u2CEB':
            case '\u2CEC':
                output[outputPos++] = 'o';
                output[outputPos++] = 'o';
                break;
            case '\u0478':
            case '\u0479':
                output[outputPos++] = 'o';
                output[outputPos++] = 'y';
                break;
            case '\u03A1':
            case '\u0420':
            case '\u13E2':
            case '\u20BD':
            case '\u2CA2':
            case '\u2CA3':
            case '\uABB2':
            case '\u1D29':
            case '\u1D3E':
            case '\u1D56':
            case '\u1D88':
            case '\u1DEE':
            case '\u209A':
            case '\u20B1':
            case '\u2DEC':
            case '\u18EC':
            case '\u2374':
                output[outputPos++] = 'P';
                break;
            case '\u03C1':
            case '\u03F7':
            case '\u03F8':
            case '\u0440':
            case '\u048E':
            case '\u048F':
            case '\u146D':
            case '\u146C':
            case '\u146E':
            case '\u1476':
            case '\u1477':
            case '\u1478':
            case '\u1479':
            case '\u1486':
            case '\u2117':
            case '\u2119':
            case '\u157E':
            case '\u157F':
            case '\u1580':
            case '\u1FEC':
            case '\uA4D1':
            case '\u2CC0':
            case '\u2CC1':
                output[outputPos++] = 'p';
                break;
            case '\u33D8':
            case '\u33D9':
                output[outputPos++] = 'P';
                output[outputPos++] = 'M';
                break;
            case '\u33D7':
                output[outputPos++] = 'P';
                output[outputPos++] = 'H';
                break;
            case '\u33DA':
                output[outputPos++] = 'P';
                output[outputPos++] = 'R';
                break;
            case '\u33B4':
                output[outputPos++] = 'P';
                output[outputPos++] = 'V';
                break;
            case '\u33BA':
                output[outputPos++] = 'P';
                output[outputPos++] = 'W';
                break;
            case '\u051A':
            case '\u211A':
            case '\u10AD':
            case '\u10B3':
            case '\u2D55':
            case '\uA7AF':
                output[outputPos++] = 'Q';
                break;
            case '\u051B':
            case '\u146B':
            case '\u1474':
            case '\u1475':
            case '\u1485':
            case '\u166F':
            case '\u10A1':
            case '\u10B7':
                output[outputPos++] = 'q';
                break;
            case '\u02B3':
            case '\u02B4':
            case '\u02B5':
            case '\u02B6':
            case '\u036C':
            case '\u13A1':
            case '\u13D2':
            case '\u211B':
            case '\u211C':
            case '\u211D':
            case '\u211E':
            case '\u211F':
            case '\u1587':
            case '\uA4E3':
            case '\uA4E4':
            case '\uAB71':
            case '\uABA2':
            case '\uA7A6':
            case '\uA7A7':
            case '\u297E':
            case '\u1D3F':
            case '\u1D5E':
            case '\u1D67':
            case '\u1D89':
            case '\u1DCA':
            case '\u1DE2':
            case '\u18D4':
            case '\uAB46':
                output[outputPos++] = 'R';
                break;
            case '\u20A8':
                output[outputPos++] = 'R';
                output[outputPos++] = 'S';
                break;
            case '\u0405':
            case '\u054F':
            case '\u0ABD':
            case '\u0AA1':  //ડ
            case '\u13DA':
            case '\u10BD':
            case '\u17DC':
            case '\u2C7E':
            case '\uA494':
            case '\uA4E2':
            case '\uA7A8':
            case '\uA7A9':
            case '\uA1D8':
            case '\uA1D9':
            case '\uA317':
            case '\u1949':
            case '\u1D8A':
            case '\u1DB3':
            case '\u1DE4':
            case '\u209B':
            case '\u20B7':
            case '\uA576':
            case '\uA5DF':
            case '\u10FD':
            case '\u13A6':
            case '\u13D5':
            case '\u18D5':
            case '\u1CBD':
                output[outputPos++] = 'S';
                break;
            case '\u33DB':
                output[outputPos++] = 'S';
                output[outputPos++] = 'R';
                break;
            case '\u33DC':
                output[outputPos++] = 'S';
                output[outputPos++] = 'V';
                break;
            case '\u02E2':
            case '\u03C2':
            case '\u0455':
            case '\u093D'://ऽ
            case '\u165A':
            case '\uABA5':
            case '\uABAA':
            case '\uA7C5':
            case '\uA7C9':
            case '\uA7CA':
            case '\u1515':
            case '\u1516':
            case '\u1521':
            case '\u1522':
            case '\u1523':
            case '\u1524':
            case '\u1506':
                output[outputPos++] = 's';
                break;
            case '\u036D':
            case '\u0372':
            case '\u03A4':
            case '\u0422':
            case '\u0442':
            case '\u04AC':
            case '\u04AD':
            case '\u13A2':
            case '\u1350':
            case '\u1351':
            case '\u1352':
            case '\u1353':
            case '\u1354':
            case '\u1355':
            case '\u1356':
            case '\u1357':
            case '\u22BA':
            case '\u20AE':    // TUGRIK SIGN ₮
            case '\u2CA6':
            case '\u2CA7':
            case '\uA4C4':
            case '\uA4D4':
            case '\uAB72':
            case '\u252F':
            case '\u2530':
            case '\u2533':
            case '\u27D9':
            case '\u2E06':
            case '\u2E07':
            case '\u3112':
            case '\u315C':
            case '\u142A':
            case '\u1748':
            case '\u1764':
            case '\u1768':
            case '\u1D40':
            case '\u1D57':
            case '\u1DB5':
            case '\u209C':
            case '\u22A4':
            case '\u23C7':
            case '\u23C9':
            case '\u2DEE':
            case '\uA50B':
                output[outputPos++] = 'T';
                break;
            case '\u0367':
            case '\u040F':
            case '\u0426':
            case '\u0446':
            case '\u045F':
            case '\u0540':
            case '\uA4A4':
            case '\uA4F4':
            case '\uAAA4':
            case '\u228C':
            case '\u228D':
            case '\u228E':
            case '\u2294':
            case '\u2A03':
            case '\u2A04':
            case '\u2A06':
            case '\u2A41':
            case '\u2A42':
            case '\u2A45':
            case '\u2A4C':
            case '\u2CD8':
            case '\u2CD9':
            case '\u2B8D':
            case '\u1467':
            case '\u1B95':
            case '\u1B96':
            case '\u1B97':
            case '\u1D41':
            case '\u1D55':
            case '\u1D58':
            case '\u1D99':
            case '\u1DB6':
            case '\u1DB7':
            case '\u1DB8':
            case '\u1DF0':
            case '\u1DF4':
            case '\u2D61':
            case '\u10AE':
            case '\u144C':
            case '\u1457':
            case '\u1458':
            case '\u1640':
            case '\u17BC':
            case '\u1919':
            case '\u1959':
            case '\u1969':
            case '\u1B27':
            case '\u212A':
            case '\u22C3':
            case '\u2D0E':
            case '\uAB52':
                output[outputPos++] = 'U';
                break;
            case '\u33B2':
                output[outputPos++] = 'U';
                output[outputPos++] = 'S';
                break;
            case '\u33B6':
                output[outputPos++] = 'U';
                output[outputPos++] = 'V';
                break;
            case '\u33BC':
                output[outputPos++] = 'U';
                output[outputPos++] = 'W';
                break;
            case '\u02C5':
            case '\u036E':
            case '\u03BD':
            case '\u03CB':
            case '\u0474':
            case '\u0475':
            case '\u0476':
            case '\u0477':
            case '\u1200':
            case '\u1201':
            case '\u1205':
            case '\u1206':
            case '\u1207':
            case '\u1731':
            case '\u17F4':
            case '\u1729':
            case '\u1F50':
            case '\u1F51':
            case '\u1F52':
            case '\u1F53':
            case '\u1F54':
            case '\u1F55':
            case '\u1F56':
            case '\u1F57':
            case '\u1FE0':
            case '\u1FE1':
            case '\u1FE2':
            case '\u1FE3':
            case '\u1FE4':
            case '\u1FE5':
            case '\u1FE6':
            case '\u1FE7':
            case '\u2174':
            case '\u2228':
            case '\u2A08': 
            case '\u2A52': 
            case '\u2A54': 
            case '\u2A56':
            case '\u2A57':
            case '\u2C7D':
            case '\u2D38':
            case '\uA902':
            case '\u13C9':
                output[outputPos++] = 'v';
                break;
            case '\u2175':
            case '\u2166':
                output[outputPos++] = 'v';
                output[outputPos++] = 'i';
                break;
            case '\u33DE':
                output[outputPos++] = 'v';
                output[outputPos++] = 'm';
                break;
            case '\u13D9':
            case '\u13E4':
            case '\u1F7A':
            case '\u1F7B':
            case '\u2164':    // Roman Numeral Five
            case '\u22C1':
            case '\u22CE':
            case '\u2648': // ARIES ♈
            case '\uA4E6': //ꓦ
            case '\uABA9':
            case '\uABB4':
            case '\u2A61':
            case '\u2A62':
            case '\u2A63':
            case '\u26BA':
            case '\u27CF':
            case '\uA8A6':
            case '\uA8AB':
            case '\uA8D7':
            case '\u2C1C':
            case '\u2C4C':
            case '\u142F':
            case '\u194E':
            case '\u1D5B':
            case '\u1D8C':
            case '\u1DB9':
            case '\u22BB':
            case '\u22BD':
            case '\uA6DF':
            case '\uAB99':
                output[outputPos++] = 'V';
                break;
            case '\u051C':
            case '\u13D4':
            case '\u20A9':   // WON SIGN    ₩
            case '\uA4EA':
            case '\uAA8D':
            case '\uAA8F':
            case '\u1D42':
            case '\u1DF1':
                output[outputPos++] = 'W';
                break;
            case '\u02B7':
            case '\u03C9':
            case '\u0460':
            case '\u0461':
            case '\u051D':
            case '\u0561':
            case '\u13B3':
            case '\u15EF':
            case '\u163A':
            case '\u164E':
            case '\u1F60':
            case '\u1F61':
            case '\u1F62':
            case '\u1F63':
            case '\u1F64':
            case '\u1F65':
            case '\u1F66':
            case '\u1F67':
            case '\u1F7D':
            case '\u1F7C':
            case '\u1FF2':
            case '\u1FF3':
            case '\u1FF4':
            case '\u1FF5':
            case '\u1FF6':
            case '\u1FF7':
            case '\uAB83':
            case '\uAA9D':
            case '\u27D2':
            case '\u2A4A':
            case '\u2ADD':
            case '\u2C1E':
            case '\u2C4E':
            case '\u2CB0':
            case '\u2CB1':
            case '\u2CC2':
            case '\u2CC3':
            case '\u1661':
            case '\u1726':
            case '\u17BD':
            case '\u18E3':
            case '\u1910':
            case '\u1955':
            case '\u1C66':
            case '\u2379':
            case '\u2D0D':
            case '\u2D13':
            case '\uA67B':
            case '\uABA4':
                output[outputPos++] = 'w';
                break;
            case '\u33DD':
                output[outputPos++] = 'w';
                output[outputPos++] = 'b';
                break;
            case '\u02DF':
            case '\u02E3':
            case '\u03A7':
            case '\u036F':
            case '\u0425':
            case '\u04B2':
            case '\u157D':
            case '\u2169':    // Roman Numeral X
            case '\u2715':  // MULTIPLICATION X  ✕ 
            case '\u2716':
            case '\u2717':
            case '\u2718':
            case '\u2A09':
            case '\u2BBD':
            case '\u2BBE':
            case '\u2BBF':
            case '\u2D5D':
            case '\uA4BC':
            case '\uA4EB':
            case '\u26CC':
            case '\u26DD':
            case '\u274C':
            case '\u274E':
            case '\u2928':
            case '\u292B':
            case '\u292C':
            case '\u292D':
            case '\u2AA5':
            case '\u2B59':
            case '\u1541':
            case '\u16B7':
            case '\u1CF5':
            case '\u1D61':
            case '\u1D6A':
            case '\u1D8D':
            case '\u2573':
            case '\u2613':
            case '\u2DEF':
                output[outputPos++] = 'X';
                break;
            case '\u03C7':
            case '\u0445':
            case '\u04FC':
            case '\u04FD':
            case '\u04FE':
            case '\u04FF':
            case '\u04B3':
            case '\u166D':
            case '\u166E':
            case '\u2179':
            case '\u2297':
            case '\u2CAC':
            case '\u2CAD':
            case '\u2D4B':
            case '\uAB53':
            case '\uAB54':
            case '\uAB55':
            case '\uA7B3':
            case '\uAA8E':
            case '\u2A2F':
            case '\u2A30':
            case '\u2A31':
            case '\u2A32':
            case '\u2A34':
            case '\u2A35':
            case '\u2A36':
            case '\u2A37':
            case '\u1763':
            case '\u194A':
            case '\u1C1E':
            case '\u22A0':
                output[outputPos++] = 'x';
                break;
            case '\u217A':
            case '\u216A':
                output[outputPos++] = 'x';
                output[outputPos++] = 'i';
                break;
            case '\u3037':
                output[outputPos++] = 'x';
                output[outputPos++] = 'x';
                break;
            case '\u02E0':
            case '\u03B3':
            case '\u038E':
            case '\u03A5':
            case '\u03AB':
            case '\u0667':
            case '\u10C4':
            case '\u1F59':
            case '\u1F5B':
            case '\u1F5D':
            case '\u1F5F':
            case '\u1FE8':
            case '\u1FE9':
            case '\u1FEA':
            case '\u1FEB':
            case '\u2CA8':
            case '\u2CA9':
            case '\u2D56':
            case '\u2E4D':
            case '\uA4EC':
            case '\uA91F':
            case '\uA9F6':
            case '\uAA97':
            case '\uA325':
            case '\uA326':
            case '\uA328':
            case '\uA329':
            case '\u311A':
            case '\u2CAE':
            case '\u2CAF':
            case '\u2144':
            case '\u2442':
            case '\u2DF1':
            case '\u2DF9':
                output[outputPos++] = 'Y';
                break;
            case '\u02B8':
            case '\u0423':
            case '\u04F0':
            case '\u04F1':
            case '\u04F2':
            case '\u04F3':
            case '\u0443':
            case '\u04AE':
            case '\u04AF':
            case '\u040E':
            case '\u04B0':
            case '\u04B1':
            case '\u0427':
            case '\u0447':
            case '\u045E':
            case '\u04B6':
            case '\u04B7':
            case '\u04B8':
            case '\u04B9':
            case '\u04CB':
            case '\u04CC':
            case '\u04F4':
            case '\u04F5':
            case '\u0B73':
            case '\u13A9':
            case '\u13BD':
            case '\u04EE':
            case '\u04EF':
            case '\u10B8':
            case '\u2D01':
            case '\u2D0B':
            case '\u2D0F':
            case '\u2D17':
            case '\u2D23':
            case '\u2D24':
            case '\uA91C':
            case '\uA98A':
            case '\uA98B':
            case '\uA98E':
            case '\uAB79':
            case '\uAB8D':
            case '\u10AF':
            case '\u10DF':
            case '\u1376':
            case '\u1918':
            case '\u1935':
            case '\u1961':
            case '\u19B4':
            case '\u19C7':
            case '\u1CA7':
            case '\u2D18':
            case '\uA677':
            case '\uA67D':
            case '\uA6B2':
            case '\uA6B5':
            case '\uAB5A':
                output[outputPos++] = 'y';
                break;
            case '\u0396':
            case '\u13C3':
            case '\u2C7F':
            case '\u2C8C':
            case '\u2C8D':
            case '\u2D2D':
            case '\uAB93':
            case '\uA7C6':
            case '\u1901':
            case '\u190F':
            case '\u1D8E':
            case '\u1DBB':
            case '\u1DBC':
            case '\u1DBD':
            case '\u1DE6':
            case '\u10CD':
            case '\u1646':
                output[outputPos++] = 'Z';
                break;
            case '\u065C':
            case '\u0701':
            case '\u0702':
            case '\u073C':
            case '\u073F':
            case '\u0740':
            case '\u0741':
            case '\u0742':
            case '\u0ABC':
            case '\u2024':
            case '\u2027':
            case '\u2B1D':
            case '\u2E31':
            case '\u2E33':
            case '\u302E':
            case '\u30FB':
            case '\uFE52':
            case '\uA947':
            case '\uA948':
            case '\u1427':
            case '\u1C79':
                output[outputPos++] = '.';
                break;
            case '\u13A4':
                output[outputPos++] = '0';
                break;
            case '\u3220':
            case '\u3280':
            case '\u3192':
            case '\u1372':
            case '\u18D3':
            case '\u1C84':
            case '\u2673':
                output[outputPos++] = '1';
                break;
            case '\u14BE':
            case '\u14BF':
            case '\u3221':
            case '\u30CB':
            case '\u3281':
            case '\u3193':
            case '\u2674':
                output[outputPos++] = '2';
                break;
            case '\u0417':
            case '\u0437':
            case '\u15F1':
            case '\u15F2':
            case '\u15F3':
            case '\u163E':
            case '\u163D':
            case '\u163C':
            case '\u1650':
            case '\u1651':
            case '\u1652':
            case '\u3222':
            case '\u3282':
            case '\uA7AB':
            case '\u1663':
            case '\u1664':
            case '\u1665':
            case '\u160A':
            case '\u160B':
            case '\u1883':
            case '\u160C':
            case '\u2CC4':
            case '\u2CC5':
            case '\u2CCC':
            case '\u2CCD':
            case '\u3194':
            case '\u18E4':
            case '\u190B':
            case '\u1C95':
            case '\u1C9E':
            case '\u1CB3':
            case '\u1D23':
            case '\u1D94':
            case '\u1D9A':
            case '\u1D9F':
            case '\u1DBE':
            case '\u2675':
            case '\u2DE5':
                output[outputPos++] = '3';
                break;
            case '\u13CE':
            case '\u3223':
            case '\u3283':
            case '\uAB9E':
            case '\u3195':
            case '\u2676':
                output[outputPos++] = '4';
                break;
            case '\u3224':
            case '\u3284':
            case '\u2677':
                output[outputPos++] = '5';
                break;
            case '\u0431':
            case '\u3225':
            case '\u3285':
            case '\uABBE':
            case '\u2CD2':
            case '\u2CD3':
            case '\u19CB':
            case '\u2678':
                output[outputPos++] = '6';
                break;
            case '\u3226':
            case '\u3286':
            case '\u10A4':
            case '\u172A':
            case '\u2679':
                output[outputPos++] = '7';
                break;
            case '\u09EA':
            case '\u0B03':
            case '\u30CF':
            case '\u3227':
            case '\u3287':
            case '\uA589':
                output[outputPos++] = '8';
                break;
            case '\u0B68':
            case '\u3228':
            case '\u3288':
            case '\uA90B':
            case '\u2CCA':
            case '\u2CCB':
            case '\u19C1':
            case '\u19C2':
            case '\u1DD2':
                output[outputPos++] = '9';
                break;
            case '\u2719':
            case '\u271A':
            case '\u271B':
            case '\u271C':
            case '\u271D':
            case '\u271E':
            case '\u1429':
            case '\u1540':
                output[outputPos++] = '+';
                break;
            case '\u1428':
            case '\u1806':
            case '\u180A':
            case '\u1C7C':
                output[outputPos++] = '-';
                break;
            case '\uFE6B':
                output[outputPos++] = '@';
                break;
            default:
                // output[outputPos++] = c;
                break;
            }
        }
    }
    
    public static void filter3C(final char c, char[] output) {
        int outputPos = 0;
        output[0] = 0;
        output[1] = 0;
        output[2] = 0;
        switch (c) {
        case '\u3372':
            output[outputPos++] = 'd';
            output[outputPos++] = 'a';
            break;
        case '\u3373':
            output[outputPos++] = 'a';
            output[outputPos++] = 'u';
            break;
        case '\u3375':
            output[outputPos++] = 'o';
            output[outputPos++] = 'v';
            break;
        case '\u3376':
            output[outputPos++] = 'p';
            output[outputPos++] = 'c';
            break;
        case '\u3377':
        case '\u3378':
        case '\u3379':
            output[outputPos++] = 'd';
            output[outputPos++] = 'm';
            break;
        case '\u337A':
            output[outputPos++] = 'I';
            output[outputPos++] = 'U';
            break;
        case '\u3380':
        case '\u33A9':
            output[outputPos++] = 'p';
            output[outputPos++] = 'A';
            break;
        case '\u3381':
            output[outputPos++] = 'n';
            output[outputPos++] = 'A';
            break;
        case '\u3382':
            output[outputPos++] = 'u';
            output[outputPos++] = 'A';
            break;
        case '\u3383':
            output[outputPos++] = 'm';
            output[outputPos++] = 'A';
            break;
        case '\u3384':
            output[outputPos++] = 'k';
            output[outputPos++] = 'A';
            break;
        case '\u3385':
            output[outputPos++] = 'K';
            output[outputPos++] = 'B';
            break;
        case '\u3386':
            output[outputPos++] = 'M';
            output[outputPos++] = 'B';
            break;
        case '\u3387':
            output[outputPos++] = 'G';
            output[outputPos++] = 'B';
            break;
        case '\u338A':
            output[outputPos++] = 'p';
            output[outputPos++] = 'F';
            break;
        case '\u338B':
            output[outputPos++] = 'n';
            output[outputPos++] = 'F';
            break;
        case '\u338C':
            output[outputPos++] = 'u';
            output[outputPos++] = 'F';
            break;
        case '\u338D':
            output[outputPos++] = 'u';
            output[outputPos++] = 'g';
            break;
        case '\u338E':
            output[outputPos++] = 'm';
            output[outputPos++] = 'g';
            break;
        case '\u338F':
            output[outputPos++] = 'k';
            output[outputPos++] = 'g';
            break;
        case '\u3390':
            output[outputPos++] = 'H';
            output[outputPos++] = 'z';
            break;
        case '\u3399':
            output[outputPos++] = 'f';
            output[outputPos++] = 'm';
            break;
        case '\u339A':
            output[outputPos++] = 'n';
            output[outputPos++] = 'm';
            break;
        case '\u339B':
            output[outputPos++] = 'u';
            output[outputPos++] = 'm';
            break;
        case '\u339C':
        case '\u33A3':
        case '\u339F':
            output[outputPos++] = 'm';
            output[outputPos++] = 'm';
            break;
        case '\u339D':
        case '\u33A0':
        case '\u33A4':
            output[outputPos++] = 'c';
            output[outputPos++] = 'm';
            break;
        case '\u33C4':
            output[outputPos++] = 'c';
            output[outputPos++] = 'c';
            break;
        case '\u33A1':
        case '\u33A5':
            output[outputPos++] = 'm';
            break;
        case '\u339E':
        case '\u33A2':
        case '\u33A6':
            output[outputPos++] = 'k';
            output[outputPos++] = 'm';
            break;
        case '\u33AA':
            output[outputPos++] = 'k';
            output[outputPos++] = 'p';
            output[outputPos++] = 'a';
            break;
        case '\u33AB':
            output[outputPos++] = 'm';
            output[outputPos++] = 'p';
            output[outputPos++] = 'a';
            break;
        case '\u33AC':
            output[outputPos++] = 'g';
            output[outputPos++] = 'p';
            output[outputPos++] = 'a';
            break;
        case '\u33B0':
            output[outputPos++] = 'p';
            output[outputPos++] = 's';
            break;
        case '\u33B1':
            output[outputPos++] = 'n';
            output[outputPos++] = 's';
            break;
        case '\u3358':
        case '\u3359':
        case '\u335A':
        case '\u335B':
        case '\u335C':
        case '\u335D':
        case '\u335E':
        case '\u335F':
        case '\u3360':
        case '\u3361':
            output[outputPos++] = (char)(c-'\u3358'+'\u0030');
            output[outputPos++] = '.'; 
            break;
        case '\u3362':
        case '\u3363':
        case '\u3364':
        case '\u3365':
        case '\u3366':
        case '\u3367':
        case '\u3368':
        case '\u3369':
        case '\u336A':
        case '\u336B':
            output[outputPos++] = '1';
            output[outputPos++] = (char)(c-'\u3362'+'\u0030');
            output[outputPos++] = '.'; 
            break;
        case '\u336C':
        case '\u336D':
        case '\u336E':
        case '\u336F':
            output[outputPos++] = '2';
            output[outputPos++] = (char)(c-'\u336C'+'\u0030');
            output[outputPos++] = '.'; 
            break;
        // ... TODO
        default:
            filter(c, output);
            break;
        }
    }
    
    public static void filter1W(final int c, char[] output) {
        int outputPos = 0;
        output[0] = 0;
        output[1] = 0;
        switch (c) {
        case 0x102A0:
        case 0x102CE:
        case 0x10300:
        case 0x1051C:
        case 0x10920:
        case 0x11AD8:
        case 0x16F40:
        case 0x16F41:
        case 0x16B2E:
        case 0x1E90F:
        case 0x1E910:
        case 0x1E91C:
        case 0x1E931:
        case 0x1F110:
        case 0x1F130:
        case 0x1F150:
        case 0x1F170:
        case 0x1F1E6:
            output[outputPos++] = 'A';
            break;
        case 0x10282:
        case 0x102A1:
        case 0x10301:
        case 0x1031C:
        case 0x11AC4:
        case 0x1D207:
        case 0x1E900:
        case 0x1E909:
        case 0x1F111:
        case 0x1F131:
        case 0x1F151:
        case 0x1F171:
        case 0x1F1E7:
            output[outputPos++] = 'B';
            break;
        case 0x100D7:
        case 0x10141:
        case 0x1015D:
        case 0x102A2:
        case 0x10302:
        case 0x10334:
        case 0x1033E:
        case 0x10415:
        case 0x104E7:
        case 0x104EE:
        case 0x10633:
        case 0x1171E:
        case 0x11658:
        case 0x11AC2:
        case 0x16A47:
        case 0x16A57:
        case 0x16F10:
        case 0x16F11:
        case 0x16F12:
        case 0x16F2E:
        case 0x16F2F:
        case 0x16B1C:
        case 0x1BC19:
        case 0x1BC1D:
        case 0x1BC27:
        case 0x1BC21:
        case 0x1BC2B:
        case 0x1D134:
        case 0x1D1CA:
        case 0x1D1CB:
        case 0x1D1CC:
        case 0x1D1CD:
        case 0x1D1CE:
        case 0x1E90C:
        case 0x1E90E:
        case 0x1F112:
        case 0x1F12B:
        case 0x1F132:
        case 0x1F152:
        case 0x1F172:
        case 0x1F1E8:
            output[outputPos++] = 'C';
            break;
        case 0x10464:
        case 0x104A8:
        case 0x104BF:
        case 0x104C6:
        case 0x1043D:
        case 0x1051B:
        case 0x11017:
        case 0x133AD:
        case 0x16F50:
        case 0x16B56:
        case 0x1D238:
        case 0x1E930:
            output[outputPos++] = 'c';
            break;
        case 0x133AE:
        case 0x1F16D:
            output[outputPos++] = 'c';
            output[outputPos++] = 'c';
            break;
        case 0x1F12D:
            output[outputPos++] = 'C';
            output[outputPos++] = 'D';
            break;
        case 0x102A3:
        case 0x10303:
        case 0x104C8:
        case 0x104C9:
        case 0x104F0:
        case 0x11025:
        case 0x11AD9:
        case 0x16A5D:
        case 0x1E906:
        case 0x1F113:
        case 0x1F133:
        case 0x1F153:
        case 0x1F173:
        case 0x1F1E9:
            output[outputPos++] = 'D';
            break;
        case 0x10286:
        case 0x102A4:
        case 0x10304:
        case 0x11ACB:
        case 0x11A25:
        case 0x16B23:
        case 0x1F114:
        case 0x1F134:
        case 0x1F154:
        case 0x1F174:
        case 0x1F1EA:
            output[outputPos++] = 'E';
            break;
        case 0x10287:
        case 0x102A5:
        case 0x10305:
        case 0x10525:
        case 0x118C2:
        case 0x1D213:
        case 0x1F115:
        case 0x1F135:
        case 0x1F155:
        case 0x1F175:
        case 0x1F1EB:
            output[outputPos++] = 'F';
            break;
        case 0x1E915:
        case 0x1E903:
        case 0x1E929:
            output[outputPos++] = 'g';
            break;
        case 0x1F116:
        case 0x1F136:
        case 0x1F156:
        case 0x1F176:
        case 0x1F1EC:
            output[outputPos++] = 'G';
            break;
        case 0x10199:
        case 0x102CF:
        case 0x10512:
        case 0x10CA2:
        case 0x10CE2:
        case 0x11AD3:
        case 0x16A58:
        case 0x1E904:
        case 0x1E92C:
        case 0x1F117:
        case 0x1F137:
        case 0x1F157:
        case 0x1F177:
        case 0x1F1ED:
            output[outputPos++] = 'H';
            break;
        case 0x1F14A:
            output[outputPos++] = 'H';
            output[outputPos++] = 'V';
            break;
        case 0x10288:
        case 0x1028A:
        case 0x102A6:
        case 0x10306:
        case 0x10309:
        case 0x1F118:
        case 0x1F138:
        case 0x1F158:
        case 0x1F178:
        case 0x1F1EE:
            output[outputPos++] = 'I';
            break;
        case 0x1F18B:
            output[outputPos++] = 'I';
            output[outputPos++] = 'C';
            break;
        case 0x1D6B7:  // pi
            output[outputPos++] = 'I';
            output[outputPos++] = 'I';
            break;
        case 0x10FEB:
        case 0x10FED:
        case 0x10FEE:
        case 0x11D57:
        case 0x16F33:
        case 0x1F119:
        case 0x1F139:
        case 0x1F159:
        case 0x1F179:
        case 0x1F1EF:
            output[outputPos++] = 'J';
            break;
        case 0x1028B:
        case 0x1030A:
        case 0x10518:
        case 0x10C9E:
        case 0x10CDE:
        case 0x16B1D:
        case 0x16B57:
        case 0x16B58:
        case 0x16B59:
            output[outputPos++] = 'k';
            break;
        case 0x1F11A:
        case 0x1F13A:
        case 0x1F15A:
        case 0x1F17A:
        case 0x1F1F0:
            output[outputPos++] = 'K';
            break;
        case 0x1030B:
        case 0x1041B:
        case 0x10526:
        case 0x118A3:
        case 0x11ACE:
        case 0x16A42:
        case 0x16F16:
        case 0x16F17:
        case 0x1F11B:
        case 0x1F13B:
        case 0x1F15B:
        case 0x1F17B:
        case 0x1F1F1:
            output[outputPos++] = 'L';
            break;
        case 0x10155:
        case 0x1028E:
        case 0x102B0:
        case 0x10311:
        case 0x1033C:
        case 0x10484:
        case 0x10935:
        case 0x10CAE:
        case 0x10FF4:
        case 0x11700:
        case 0x11712:
        case 0x16B2B:
        case 0x1F11C:
        case 0x1F13C:
        case 0x1F15C:
        case 0x1F17C:
        case 0x1F1F2:
        case 0x1F1AD:
            output[outputPos++] = 'M';
            break;
        case 0x1F14B:
            output[outputPos++] = 'M';
            output[outputPos++] = 'V';
            break;
        case 0x1F16A:
            output[outputPos++] = 'M';
            output[outputPos++] = 'C';
            break;
        case 0x1F16B:
            output[outputPos++] = 'M';
            output[outputPos++] = 'D';
            break;
        case 0x1028F:
        case 0x102AA:
        case 0x1033D:
        case 0x1030D:
        case 0x10513:
        case 0x108E7:
        case 0x10FF5:
        case 0x11AE1:
        case 0x11A30:
        case 0x16AD1:
        case 0x16B22:
        case 0x1F11D:
        case 0x1F13D:
        case 0x1F15D:
        case 0x1F17D:
        case 0x1F1F3:
            output[outputPos++] = 'N';
            break;
        case 0x10292:
        case 0x102AB:
        case 0x1030F:
        case 0x104A0:
        case 0x104C2:
        case 0x10516:
        case 0x1092C:
        case 0x1065D:
        case 0x1119C:
        case 0x11124:
        case 0x1101E:
        case 0x118B5:
        case 0x11A20:
        case 0x169CB:
        case 0x16A60:
        case 0x16AD5:
        case 0x16AE9:
        case 0x1D1C7:
        case 0x1D1C8:
        case 0x1D1C9:
        case 0x1E827:
        case 0x1F11E:
        case 0x1F13E:
        case 0x1F15E:
        case 0x1F17E:
        case 0x1F1F4:
            output[outputPos++] = 'O';
            break;
        case 0x10404:
        case 0x10486:
        case 0x104EA:
        case 0x10A72:
        case 0x10A92:
        case 0x11320:
        case 0x11D50:
        case 0x11AE4:
        case 0x13082:
            output[outputPos++] = 'o';
            break;
        case 0x10295:
        case 0x1031B:
        case 0x10313:
        case 0x11AE2:
        case 0x1F11F:
        case 0x1F13F:
        case 0x1F15F:
        case 0x1F17F:
        case 0x1F18A:
        case 0x1F1F5:
            output[outputPos++] = 'P';
            break;
        case 0x1F18C:
            output[outputPos++] = 'P';
            output[outputPos++] = 'A';
            break;
        case 0x1F120:
        case 0x1F140:
        case 0x1F160:
        case 0x1F180:
        case 0x1F1F6:
            output[outputPos++] = 'Q';
            break;
        case 0x102AF:
        case 0x11AC9:
        case 0x16F35:
        case 0x16F36:
        case 0x1D216:
        case 0x1F121:
        case 0x1F12C:
        case 0x1F141:
        case 0x1F161:
        case 0x1F181:
        case 0x1F1F7:
            output[outputPos++] = 'R';
            break;
        case 0x10296:
        case 0x10314:
        case 0x10343:
        case 0x10420:
        case 0x104A1:
        case 0x10496:
        case 0x16AD6:
        case 0x16F3A:
        case 0x1F122:
        case 0x1F12A:
        case 0x1F142:
        case 0x1F162:
        case 0x1F182:
        case 0x1F1F8:
            output[outputPos++] = 'S';
            break;
        case 0x1F14C:
            output[outputPos++] = 'S';
            output[outputPos++] = 'D';
            break;
        case 0x1F14D:
            output[outputPos++] = 'S';
            output[outputPos++] = 'S';
            break;
        case 0x1F18D:
            output[outputPos++] = 'S';
            output[outputPos++] = 'A';
            break;
        case 0x10297:
        case 0x102B1:
        case 0x10315:
        case 0x10344:
        case 0x1092F:
        case 0x10E9C:
        case 0x11065:
        case 0x10FF2:
        case 0x11AD0:
        case 0x16A4B:
        case 0x16F0A:
        case 0x16F0B:
        case 0x1F123:
        case 0x1F143:
        case 0x1F163:
        case 0x1F183:
        case 0x1F1F9:
            output[outputPos++] = 'T';
            break;
        case 0x104A9:
        case 0x104CE:
        case 0x10FE8:
        case 0x118B8:
        case 0x11D52:
        case 0x11AC5:
        case 0x16F42:
        case 0x1E90B:
        case 0x1F124:
        case 0x1F144:
        case 0x1F164:
        case 0x1F184:
        case 0x1F1FA:
            output[outputPos++] = 'U';
            break;
        case 0x10016:
        case 0x10197:
        case 0x1051D:
        case 0x10828:
        case 0x10CFB:
        case 0x10C1F:
        case 0x118A0:
        case 0x118C0:
        case 0x11706:
        case 0x11ADF:
        case 0x16A4D:
        case 0x16AE0:
        case 0x16F08:
        case 0x16F09:
        case 0x1D20D:
        case 0x1F125:
        case 0x1F145:
        case 0x1F165:
        case 0x1F185:
        case 0x1F1FB:
            output[outputPos++] = 'V';
            break;
        case 0x1036A:
        case 0x10366:
        case 0x1110A:
        case 0x11120:
        case 0x16B24:
        case 0x1D20C:
        case 0x1F126:
        case 0x1F146:
        case 0x1F166:
        case 0x1F186:
        case 0x1F1FC:
            output[outputPos++] = 'w';
            break;
        case 0x1F12E:
            output[outputPos++] = 'W';
            output[outputPos++] = 'z';
            break;
        case 0x1F14F:
            output[outputPos++] = 'w';
            output[outputPos++] = 'c';
            break;
        case 0x10196:
        case 0x10290:
        case 0x10289:
        case 0x102B4:
        case 0x10322:
        case 0x10317:
        case 0x10347:
        case 0x10527:
        case 0x108AB:
        case 0x10A69:
        case 0x10E94:
        case 0x10CC2:
        case 0x10CFC:
        case 0x10C13:
        case 0x1100B:
        case 0x1100C:
        case 0x10FEC:
        case 0x1F127:
        case 0x1F147:
        case 0x1F167:
        case 0x1F187:
        case 0x1F1FD:
            output[outputPos++] = 'X';
            break;
        case 0x102B2:
        case 0x102B5:
        case 0x10316:
        case 0x1041C:
        case 0x1061E:
        case 0x16A5C:
        case 0x16F43:
        case 0x16F44:
        case 0x1F128:
        case 0x1F148:
        case 0x1F168:
        case 0x1F188:
        case 0x1F1FE:
            output[outputPos++] = 'Y';
            break;
        case 0x10341:
        case 0x10345:
        case 0x104A6:
        case 0x1048B:
        case 0x1048D:
        case 0x10524:
        case 0x1087D:
        case 0x10870:
        case 0x1086A:
        case 0x1086B:
        case 0x10861:
        case 0x1086F:
        case 0x10897:
        case 0x10A17:
        case 0x10A1C:
        case 0x10C20:
        case 0x1105E:
        case 0x10FEA:
        case 0x10FEF:
        case 0x10FF3:
        case 0x10F0B:
        case 0x118C4:
        case 0x1E908:
        case 0x1E917:
        case 0x1E918:
        case 0x1E93A:
            output[outputPos++] = 'y';
            break;
        case 0x10507:
        case 0x11AD1:
        case 0x16ADF:
        case 0x1F129:
        case 0x1F149:
        case 0x1F169:
        case 0x1F189:
        case 0x1F1FF:
            output[outputPos++] = 'z';
            break;
        case 0x1FBF0:
        case 0x1F100:
        case 0x1F101:
        case 0x1F10B:
        case 0x1F10C:
        case 0x1F10D:
            output[outputPos++] = '0';
            break;
        case 0x1FBF1:
        case 0x1F102:
            output[outputPos++] = '1';
            break;
        case 0x11113:
        case 0x11652:
        case 0x11AC7:
        case 0x11A0F:
        case 0x1FBF2:
        case 0x1F103:
            output[outputPos++] = '2';
            break;
        case 0x11653:
        case 0x16AD0:
        case 0x16F3B:
        case 0x16F3C:
        case 0x1D206:
        case 0x1D228:
        case 0x1E934:
        case 0x1FBF3:
        case 0x1F104:
            output[outputPos++] = '3';
            break;
        case 0x16E82:
        case 0x16E83:
        case 0x16B25:
        case 0x1FBF4:
        case 0x1F105:
            output[outputPos++] = '4';
            break;
        case 0x1FBF5:
        case 0x1F106:
            output[outputPos++] = '5';
            break;
        case 0x102C9:
        case 0x1FBF6:
        case 0x1F107:
            output[outputPos++] = '6';
            break;
        case 0x10487:
        case 0x16A48:
        case 0x16AE5:
        case 0x1D212:
        case 0x1FBF7:
        case 0x1F108:
            output[outputPos++] = '7';
            break;
        case 0x102A7:
        case 0x10307:
        case 0x1031A:
        case 0x10931:
        case 0x169FE:
        case 0x1E8CB:
        case 0x1FBF8:
        case 0x1F109:
            output[outputPos++] = '8';
            break;
        case 0x10498:
        case 0x11651:
        case 0x169C1:
        case 0x16A65:
        case 0x16A64:
        case 0x16A43:
        case 0x16A46:
        case 0x1FBF9:
        case 0x1F10A:
            output[outputPos++] = '9';
            break;
        case 0x10AF3:
        case 0x10AF4:
        case 0x111D0:
        case 0x11173:
        case 0x11174:
        case 0x11101:
        case 0x110BB:
        case 0x114C3:
        case 0x11AEF:
        case 0x16AF0:
        case 0x1BC00:
            output[outputPos++] = '.';
            break;
        case 0x11102:
            output[outputPos++] = '.';
            output[outputPos++] = '.';
            break;
        default:
            break;
        }
    }

    public static String filter1D400_1D800(int codePoint) {
        if (codePoint >= 0x1D400 && codePoint < 0x1D6A4) {
            int postition = codePoint - 0x1D400;
            int x = postition / 26;
            int y = postition % 26;
            return "" + (x % 2 == 0 ? (char) ('A' + y) : (char) ('a' + y));
        }else if (codePoint >= 0x1D6A8 && codePoint < 0x1D7CA) {
            int postition = (codePoint - 0x1D6A8) % 58;
            switch (postition) {
            case 0:
            case 26:
                return "A";
            case 1:
            case 27:
                return "B";
            case 43:
                return "C";
            case 4:
            case 56:
                return "E";
            case 5:
                return "Z";
            case 6:
                return "H";
            case 8:
                return "I";
            case 9:
            case 35:
                return "K";
            case 11:
                return "M";
            case 12:
            case 32:
                return "N";
            case 14:
            case 40:
                return "O";
            case 15:
                return "II";
            case 16:
            case 42:
                return "P";
            case 19:
                return "T";
            case 20:
            case 28:
                return "Y";
            case 37:
                return "u";
            case 38:
            case 46:
            case 53:
                return "V";
            case 50:
                return "w";
            case 22:
            case 48:
                return "x";
            default:
                return "";
            }
        }else if (codePoint == 0x1D7CA || codePoint == 0x1D7CB) {
            return "F";
        }else if (codePoint >= 0x1D7CE && codePoint < 0x1D800) {
            int postition = codePoint - 0x1D7CE;
            return "" + ((char) ('0' + postition%10));
        }
        return "";
    }
}
