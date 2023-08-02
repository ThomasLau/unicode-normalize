package xyz.thomaslau.unicode;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import com.google.common.io.BaseEncoding;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
public class CodeUtilV2 {
    public static String encodeUsingGuava(byte[] bytes) {
        return BaseEncoding.base16().encode(bytes);
    }

    public static byte[] decodeUsingGuava(String hexString) {
        return BaseEncoding.base16().decode(hexString.toUpperCase());
    }
    
    public static String hexDump(byte[] buf) {
        ByteBuf byteBuf = Unpooled.wrappedBuffer(buf);
        return ByteBufUtil.prettyHexDump(byteBuf.slice());
    }
    
    public static String prettyByteArrToStr(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X ", b));
        }
        return sb.toString();
    }
    public static String byteArrToStr(byte[] arrb) {
        return Hex.encodeHexString(arrb);
    }

    public byte[] byteStrToBytes(String hexString) throws DecoderException {
        return Hex.decodeHex(hexString);
    }
}
