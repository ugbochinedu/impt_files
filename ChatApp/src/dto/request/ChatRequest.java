package dto.request;

import lombok.Data;

@Data
public class ChatRequest {
    private String senderId;
    private String receivingId;
    private String rawMessage;





}
