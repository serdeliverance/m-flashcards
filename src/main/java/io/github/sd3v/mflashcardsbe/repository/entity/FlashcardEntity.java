package io.github.sd3v.mflashcardsbe.repository.entity;

public record FlashcardEntity(Long id, String front, String back, String example, Long deckId) {}
