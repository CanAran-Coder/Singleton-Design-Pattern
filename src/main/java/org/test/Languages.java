package org.test;

public  class Languages {

    private static Languages Instance;

    private Languages() {};

    public static synchronized Languages getInstance() {
        if(Instance == null){
            Instance = new Languages();
            return Instance;
        }

        return Instance;

    }

}
