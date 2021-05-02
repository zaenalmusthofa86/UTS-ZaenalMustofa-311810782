# Ujian Tengah Semester

#Tampilan Menu Utama

![img](https://github.com/zaenalmusthofa86/UTS-ZaenalMustofa-311810782-TI.18.D1-UTSApps/blob/main/img/1.JPG)

Penjelasan merubah dan mengganti type dan nomor parameter :

```
public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
```

1. Menampilkan Web :

```
@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        webviewku = view.findViewById(R.id.webview);
        websettingku = webviewku.getSettings();

        webviewku.setWebViewClient(new WebViewClient());
        webviewku.loadUrl("https://www.detik.com/");
        return view;
    }
```

![img](https://github.com/zaenalmusthofa86/UTS-ZaenalMustofa-311810782-TI.18.D1-UTSApps/blob/main/img/2.JPG)

2. Menampilkan Email :

```
@Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW
                        , Uri.parse("mailto:" + etTo.getText(). toString()));
                intent.putExtra(Intent.EXTRA_SUBJECT,etSubject.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT,etMessage.getText().toString());
                startActivity(intent);
            }
```

![img](https://github.com/zaenalmusthofa86/UTS-ZaenalMustofa-311810782-TI.18.D1-UTSApps/blob/main/img/3.JPG)

3. Menampilkan Map :

```
@Override
            public void onMapReady(GoogleMap googleMap) {
                googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
                    @Override
                    public void onMapClick(LatLng latLng) {
                        MarkerOptions markerOptions = new MarkerOptions();
                        markerOptions.position(latLng);
                        markerOptions.title(latLng.latitude + " : " + latLng.longitude);
                        googleMap.clear();
                        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                                latLng,10
                        ));
                        googleMap.addMarker(markerOptions);
                    }
                });
            }
        });
```

![img](https://github.com/zaenalmusthofa86/UTS-ZaenalMustofa-311810782-TI.18.D1-UTSApps/blob/main/img/4.JPG)

4. Menampilkan Telphone :

```
@Override
            public void onClick(View view) {
                String s = edit_text_number.getText().toString();
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" + s));
                startActivity(i);
            }
        });
```

![img](https://github.com/zaenalmusthofa86/UTS-ZaenalMustofa-311810782-TI.18.D1-UTSApps/blob/main/img/5.JPG)

