package Design_Patterns.Visitor_Pattern.example1;

public interface Visitor {
    double visit(Book book);
    double visit(Phone phone);
}
