package com.example.firebase_in_app_messaging;

import androidx.test.rule.ActivityTestRule;
import com.example.firebase_in_app_messaging_example.MainActivity;
import dev.flutter.plugins.e2e.FlutterTestRunner;
import org.junit.Rule;
import org.junit.runner.RunWith;

@RunWith(FlutterTestRunner.class)
public class MainActivityTest {
  @Rule public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);
}
