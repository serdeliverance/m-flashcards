/*
 * This file is generated by jOOQ.
 */
package io.github.sd3v.mflashcardsbe.jooq;


import io.github.sd3v.mflashcardsbe.jooq.tables.Deck;
import io.github.sd3v.mflashcardsbe.jooq.tables.Flashcard;
import io.github.sd3v.mflashcardsbe.jooq.tables.FlywaySchemaHistory;
import io.github.sd3v.mflashcardsbe.jooq.tables.records.DeckRecord;
import io.github.sd3v.mflashcardsbe.jooq.tables.records.FlashcardRecord;
import io.github.sd3v.mflashcardsbe.jooq.tables.records.FlywaySchemaHistoryRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<DeckRecord> DECK_PKEY = Internal.createUniqueKey(Deck.DECK, DSL.name("deck_pkey"), new TableField[] { Deck.DECK.ID }, true);
    public static final UniqueKey<FlashcardRecord> FLASHCARD_PKEY = Internal.createUniqueKey(Flashcard.FLASHCARD, DSL.name("flashcard_pkey"), new TableField[] { Flashcard.FLASHCARD.ID }, true);
    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, DSL.name("flyway_schema_history_pk"), new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<FlashcardRecord, DeckRecord> FLASHCARD__FK_DECK_ID = Internal.createForeignKey(Flashcard.FLASHCARD, DSL.name("fk_deck_id"), new TableField[] { Flashcard.FLASHCARD.DECK_ID }, Keys.DECK_PKEY, new TableField[] { Deck.DECK.ID }, true);
}