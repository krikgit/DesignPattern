package structural.facade.assignment;

public class HotelKeeperFacade {

    public VegMenu getVegMenu(){
        VegRestaurant vr = new VegRestaurant();
        VegMenu vm = (VegMenu) vr.getMenus();
        return vm;
    }

    public NonVegMenu getNonVegMenu(){
        NonVegRestaurant nvr = new NonVegRestaurant();
        NonVegMenu nvm = (NonVegMenu) nvr.getMenus();
        return nvm;
    }

    public Both getBothMenu(){
        VegNonBothRestaurant br = new VegNonBothRestaurant();
        Both bm = (Both) br.getMenus();
        return bm;
    }
}
