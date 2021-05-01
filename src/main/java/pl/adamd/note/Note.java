package pl.adamd.note;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "notes")
class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Note must have a title")
    private String title;
    private String noteContent;

    Note() {
    }

    public int getId() {
        return id;
    }

    void setId(final int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    void setTitle(final String title) {
        this.title = title;
    }

    public String getNoteContent() {
        return noteContent;
    }

    void setNoteContent(final String noteContent) {
        this.noteContent = noteContent;
    }
}
