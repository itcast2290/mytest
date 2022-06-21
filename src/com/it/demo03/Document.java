package com.it.demo03;

public enum Document {

    DOCUMENT_1("11", "content");

    private String documentId;

    private String content;

    Document(String documentId, String content) {
        this.documentId = documentId;
        this.content = content;
    }

    public String getDocumentId() {
        return documentId;
    }

    public String getContent() {
        return content;
    }

}
