package com.hang.handler.jsonHandler;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.*;
import com.hang.entity.test.MyProperties;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class MyJsonComponent {
    /**
     * 加码
     * */
    public static class Serializer extends JsonSerializer<MyProperties>{
        @Override
        public void serialize(MyProperties value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeStartObject();//开始解析
            gen.writeStringField("enabled", String.valueOf(value.isEnabled())+"resolved");
            gen.writeEndObject();//结束
        }
    }

    /**
     * 解析
     * */
    public static class Deserializer extends JsonDeserializer<MyProperties> {
        @Override
        public MyProperties deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException {
            ObjectCodec codec = jsonParser.getCodec();
            JsonNode tree = codec.readTree(jsonParser); //获取值
            String enabled = tree.get("enabled").textValue();
            MyProperties properties = new MyProperties();
            //properties.setEnabled(Boolean.getBoolean(enabled));
            properties.setEnabled(true);
            return properties;
        }
    }
}
