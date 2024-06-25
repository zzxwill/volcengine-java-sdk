package com.volcengine.ark.runtime.model.completion.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.bot.completion.chat.BotChatCompletionRequest;

import java.util.List;
import java.util.Map;

public class ChatCompletionRequest {

    /**
     * ID of the model to use.
     */
    String model;

    /**
     * The messages to generate chat completions.
     * see {@link ChatMessage}
     */
    List<ChatMessage> messages;

    /**
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower
     * values like 0.2 will make it more focused and deterministic.
     * We generally recommend altering this or top_p but not both.
     */
    Double temperature;

    /**
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens
     * with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.<br>
     * We generally recommend altering this or temperature but not both.
     */
    @JsonProperty("top_p")
    Double topP;

    /**
     * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only
     * as they become available, with the stream terminated by a data: [DONE] message.
     */
    Boolean stream;

    /**
     * Options for streaming response. Only set this when you set stream: true.
     */
    @JsonProperty("stream_options")
    ChatCompletionRequestStreamOptions streamOptions;

    /**
     * Up to 4 sequences where the API will stop generating further tokens.
     */
    List<String> stop;

    /**
     * The maximum number of tokens allowed for the generated answer.
     */
    @JsonProperty("max_tokens")
    Integer maxTokens;

    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far,
     * increasing the model's likelihood to talk about new topics.
     */
    @JsonProperty("presence_penalty")
    Double presencePenalty;

    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far,
     * decreasing the model's likelihood to repeat the same line verbatim.
     */
    @JsonProperty("frequency_penalty")
    Double frequencyPenalty;

    /**
     * Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100
     * to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will
     * vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100
     * should result in a ban or exclusive selection of the relevant token.
     */
    @JsonProperty("logit_bias")
    Map<String, Integer> logitBias;


    /**
     * A unique identifier representing your end-user, which will help to monitor and detect abuse.
     */
    String user;

    /**
     * A list of the available functions.
     */
    List<ChatFunction> functions;

    /**
     * A list of the available tools.
     */
    List<ChatTool> tools;

    /**
     * Controls how the model responds to function calls.
     */
    @JsonProperty("function_call")
    ChatCompletionRequestFunctionCall functionCall;

    /**
     * Whether to return log probabilities of the output tokens or not.
     * If true, returns the log probabilities of each output token returned in the content of message.
     */
    Boolean logprobs;

    /**
     * An integer between 0 and 20 specifying the number of most likely tokens to return at each token position,
     * each with an associated log probability. logprobs must be set to true if this parameter is used.
     */
    @JsonProperty("top_logprobs")
    Integer topLogprobs;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<ChatMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<ChatMessage> messages) {
        this.messages = messages;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getTopP() {
        return topP;
    }

    public void setTopP(Double topP) {
        this.topP = topP;
    }

    public Boolean getStream() {
        return stream;
    }

    public void setStream(Boolean stream) {
        this.stream = stream;
    }

    public ChatCompletionRequestStreamOptions getStreamOptions() {
        return streamOptions;
    }

    public void setStreamOptions(ChatCompletionRequestStreamOptions streamOptions) {
        this.streamOptions = streamOptions;
    }

    public List<String> getStop() {
        return stop;
    }

    public void setStop(List<String> stop) {
        this.stop = stop;
    }

    public Integer getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public Double getPresencePenalty() {
        return presencePenalty;
    }

    public void setPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
    }

    public Double getFrequencyPenalty() {
        return frequencyPenalty;
    }

    public void setFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
    }

    public Map<String, Integer> getLogitBias() {
        return logitBias;
    }

    public void setLogitBias(Map<String, Integer> logitBias) {
        this.logitBias = logitBias;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public List<ChatFunction> getFunctions() {
        return functions;
    }

    public void setFunctions(List<ChatFunction> functions) {
        this.functions = functions;
    }

    public List<ChatTool> getTools() {
        return tools;
    }

    public void setTools(List<ChatTool> tools) {
        this.tools = tools;
    }

    public ChatCompletionRequestFunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(ChatCompletionRequestFunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public Boolean getLogprobs() {
        return logprobs;
    }

    public void setLogprobs(Boolean logprobs) {
        this.logprobs = logprobs;
    }

    public Integer getTopLogprobs() {
        return topLogprobs;
    }

    public void setTopLogprobs(Integer topLogprobs) {
        this.topLogprobs = topLogprobs;
    }

    @Override
    public String toString() {
        return "ChatCompletionRequest{" +
                "model='" + model + '\'' +
                ", messages=" + messages +
                ", temperature=" + temperature +
                ", topP=" + topP +
                ", stream=" + stream +
                ", streamOptions=" + streamOptions +
                ", stop=" + stop +
                ", maxTokens=" + maxTokens +
                ", presencePenalty=" + presencePenalty +
                ", frequencyPenalty=" + frequencyPenalty +
                ", logitBias=" + logitBias +
                ", user='" + user + '\'' +
                ", functions=" + functions +
                ", tools=" + tools +
                ", functionCall=" + functionCall +
                ", logprobs=" + logprobs +
                ", topLogprobs=" + topLogprobs +
                '}';
    }

    public static class ChatCompletionRequestFunctionCall {
        String name;

        public ChatCompletionRequestFunctionCall(String name) {
            this.name = name;
        }

        public static ChatCompletionRequestFunctionCall of(String name) {
            return new ChatCompletionRequestFunctionCall(name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class ChatCompletionRequestStreamOptions {
        @JsonProperty("include_usage")
        Boolean includeUsage;

        public ChatCompletionRequestStreamOptions(Boolean includeUsage) {
            this.includeUsage = includeUsage;
        }

        public static ChatCompletionRequestStreamOptions of(Boolean includeUsage) {
            return new ChatCompletionRequestStreamOptions(includeUsage);
        }

        public Boolean getIncludeUsage() {
            return includeUsage;
        }

        public void setIncludeUsage(Boolean includeUsage) {
            this.includeUsage = includeUsage;
        }
    }

    public static ChatCompletionRequest.Builder builder() {
        return new ChatCompletionRequest.Builder();
    }

    public static class Builder {
        private String model;
        private List<ChatMessage> messages;
        private Double temperature;
        private Double topP;
        private Boolean stream;
        private ChatCompletionRequestStreamOptions streamOptions;
        private List<String> stop;
        private Integer maxTokens;
        private Double presencePenalty;
        private Double frequencyPenalty;
        private Map<String, Integer> logitBias;
        private String user;
        private List<ChatFunction> functions;
        private List<ChatTool> tools;
        private ChatCompletionRequestFunctionCall functionCall;
        private Boolean logprobs;
        private Integer topLogprobs;

        public ChatCompletionRequest.Builder model(String model) {
            this.model = model;
            return this;
        }

        public ChatCompletionRequest.Builder messages(List<ChatMessage> messages) {
            this.messages = messages;
            return this;
        }

        public ChatCompletionRequest.Builder temperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }

        public ChatCompletionRequest.Builder topP(Double topP) {
            this.topP = topP;
            return this;
        }

        public ChatCompletionRequest.Builder stream(Boolean stream) {
            this.stream = stream;
            return this;
        }

        public ChatCompletionRequest.Builder streamOptions(ChatCompletionRequestStreamOptions streamOptions) {
            this.streamOptions = streamOptions;
            return this;
        }

        public ChatCompletionRequest.Builder stop(List<String> stop) {
            this.stop = stop;
            return this;
        }

        public ChatCompletionRequest.Builder maxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }

        public ChatCompletionRequest.Builder presencePenalty(Double presencePenalty) {
            this.presencePenalty = presencePenalty;
            return this;
        }

        public ChatCompletionRequest.Builder frequencyPenalty(Double frequencyPenalty) {
            this.frequencyPenalty = frequencyPenalty;
            return this;
        }

        public ChatCompletionRequest.Builder logitBias(Map<String, Integer> logitBias) {
            this.logitBias = logitBias;
            return this;
        }

        public ChatCompletionRequest.Builder user(String user) {
            this.user = user;
            return this;
        }

        public ChatCompletionRequest.Builder functions(List<ChatFunction> functions) {
            this.functions = functions;
            return this;
        }

        public ChatCompletionRequest.Builder tools(List<ChatTool> tools) {
            this.tools = tools;
            return this;
        }

        public ChatCompletionRequest.Builder functionCall(ChatCompletionRequestFunctionCall functionCall) {
            this.functionCall = functionCall;
            return this;
        }

        public ChatCompletionRequest.Builder logprobs(Boolean logprobs) {
            this.logprobs = logprobs;
            return this;
        }

        public ChatCompletionRequest.Builder topLogprobs(Integer topLogprobs) {
            this.topLogprobs = topLogprobs;
            return this;
        }

        public ChatCompletionRequest build() {
            ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
            chatCompletionRequest.setModel(model);
            chatCompletionRequest.setMessages(messages);
            chatCompletionRequest.setTemperature(temperature);
            chatCompletionRequest.setTopP(topP);
            chatCompletionRequest.setStream(stream);
            chatCompletionRequest.setStreamOptions(streamOptions);
            chatCompletionRequest.setStop(stop);
            chatCompletionRequest.setMaxTokens(maxTokens);
            chatCompletionRequest.setPresencePenalty(presencePenalty);
            chatCompletionRequest.setFrequencyPenalty(frequencyPenalty);
            chatCompletionRequest.setLogitBias(logitBias);
            chatCompletionRequest.setUser(user);
            chatCompletionRequest.setFunctions(functions);
            chatCompletionRequest.setTools(tools);
            chatCompletionRequest.setFunctionCall(functionCall);
            chatCompletionRequest.setLogprobs(logprobs);
            chatCompletionRequest.setTopLogprobs(topLogprobs);
            return chatCompletionRequest;
        }
    }
}
