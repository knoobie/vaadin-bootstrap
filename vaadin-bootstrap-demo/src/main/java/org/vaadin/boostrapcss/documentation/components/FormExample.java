package org.vaadin.boostrapcss.documentation.components;

import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.vaadin.boostrapcss.components.BsButton;
import org.vaadin.boostrapcss.enums.BsColResponsiveBP;
import org.vaadin.boostrapcss.enums.BsColor;
import org.vaadin.boostrapcss.layout.form.BsFormRow;
import org.vaadin.boostrapcss.layout.responsive.BsContainer;
import org.vaadin.boostrapcss.demo.BsDemoView;

@Route(value = FormExample.CURRENT_URL)
public class FormExample extends BsDemoView {

    public static final String CURRENT_URL = "components/forms/";

    public FormExample() {
        super(BOOTSTRAP_DOCS_ROOT + CURRENT_URL);
    }
    @Override
    protected void initView() {
        super.initView();
        createBasicExample();
        createComplexExample();
    }

    private void createBasicExample() {
        Div message = createMessageDiv("basic-message");
        message.setText("Default configuration for form");
        // begin-source-example
        // source-example-heading: Basic Example
        BsContainer form = new BsContainer(true);
        BsFormRow row = new BsFormRow();
        TextField firstName = new TextField("First Name");
        row.addCol().withSizes(12,6).addFullWidth(firstName);
        TextField lastName = new TextField("Last Name");
        row.addCol().withSizes(12, 6).addFullWidth(lastName);
        form.add(row);
        // end-source-example

        addCodeExample("Basic Example", form, message);
    }

    private void createComplexExample() {
        Div message = createMessageDiv("complex-message");
        message.setText("Configuration for complex form");
        // begin-source-example
        // source-example-heading: Complex Example
        BsContainer form = new BsContainer(true);
        BsFormRow row = new BsFormRow();
        EmailField email = new EmailField("Email");
        email.setWidthFull();
        row.addCol().withSizes(12,6).addFullWidth(email);
        PasswordField password = new PasswordField("Password");
        password.setWidthFull();
        row.addCol().withSizes(12, 6).addFullWidth(password);
        form.add(row);
        BsFormRow row2 = new BsFormRow();
        row2.addCol().withEqualSize().addFullWidth(new TextField("Address"));
        form.add(row2);
        BsFormRow row3 = new BsFormRow();
        row3.addCol().withEqualSize().addFullWidth(new TextField("Address 2"));
        form.add(row3);
        BsFormRow row4 = new BsFormRow();
        row4.addCol().withSize(BsColResponsiveBP.MD,6).addFullWidth(new TextField("City"));
        Select<String> select = new Select<>("Country 1 ", "...");
        select.setLabel("Country");
        row4.addCol().withSize(BsColResponsiveBP.MD,4).addFullWidth(select);
        row4.addCol().withSize(BsColResponsiveBP.MD,2).addFullWidth(new TextField("Zip"));
        form.add(row4);
        BsFormRow row5 = new BsFormRow();
        row5.addCol().addFullWidth(new Checkbox("I agree .... "));
        form.add(row5);
        BsFormRow row6 = new BsFormRow();
        row6.addCol().withEqualSize().add(new BsButton("Submit").withColor(BsColor.PRIMARY));
        row6.addCol().withAutoSize().add(new BsButton("Delete").withOutlineColor(BsColor.DANGER));
        form.add(row6);
        // end-source-example

        addCodeExample("Complex Example", form, message);
    }

}