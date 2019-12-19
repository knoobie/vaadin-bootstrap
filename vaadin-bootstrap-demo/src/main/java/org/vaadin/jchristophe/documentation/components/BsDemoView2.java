package org.vaadin.jchristophe.documentation.components;

import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.demo.DemoView;
import com.vaadin.flow.router.RouterLink;
import org.vaadin.jchristophe.bootstrap.components.BsNavBar;

//
//@StyleSheet("https://use.fontawesome.com/releases/v5.8.2/css/all.css")
//@StyleSheet("https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css")
//@StyleSheet("https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.11/css/mdb.min.css")
//@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js")
//@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js")
//@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js")
//@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.11/js/mdb.min.js")

@StyleSheet("https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css")
@JavaScript("https://code.jquery.com/jquery-3.4.1.slim.min.js")
@JavaScript("https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js")
@JavaScript("https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js")
public abstract class BsDemoView2 extends DemoView {

    public BsDemoView2() {
        super();
        BsNavBar navBar = new BsNavBar("mainNav").withNavBarDark().withBgDark();
        navBar.addNavLink(new RouterLink("Badge", BadgeExample.class));
        navBar.addNavLink(new RouterLink("NavBar", NavBarExample.class));
        navBar.addNavLink(new RouterLink("Card", CardExample.class));
        navBar.addNavLink(new RouterLink("ListGroup", ListGroupExample.class));
        navBar.withNavBrandText("Documentation Bootstrap");
        navBar.addClassName("fixed-top");
        add(navBar);
    }

    protected Div createMessageDiv(String id) {
        Div message = new Div();
        message.setId(id);
        message.getStyle().set("whiteSpace", "pre");
        return message;
    }

    @Override
    protected void initView() {
    }
}